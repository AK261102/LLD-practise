package PRACTISE.File_System.core;

import java.nio.file.FileSystem;

import Behavioural_Design_Pattern.Chain_Of_Responsibility_Design_Pattern.Good_Code.Director;
import PRACTISE.File_System.nodes.Directory;
import PRACTISE.File_System.nodes.File;
import PRACTISE.File_System.nodes.FileSystemNode;

/**
 * ══════════════════════════════════════════════════════════════════
 *                STEP 4: FILE SYSTEM MANAGER
 * ══════════════════════════════════════════════════════════════════
 * 
 * Central manager for all file system operations.
 * 
 * RESPONSIBILITIES:
 *   - Create paths (files and directories)
 *   - Delete paths
 *   - Navigate to nodes
 *   - Read/Write file content
 *   - Display file system structure
 * 
 * 
 * PATH HANDLING:
 * ──────────────
 * Path: "/documents/notes/lld.md"
 * 
 * Split by "/":
 *   ["", "documents", "notes", "lld.md"]
 * 
 * Traverse:
 *   root → documents → notes → lld.md
 * 
 * 
 * FILE vs DIRECTORY DETECTION:
 * ────────────────────────────
 * If last component has ".": Create as File
 * Otherwise: Create as Directory
 * 
 *   "/documents/notes"     → Directory
 *   "/documents/report.txt" → File
 */


public class Filesystem {
    

    private Filesystem root;

    public FileSystem()
    {
        this.root = new Director("/");

    }

      public boolean isValidPath(String path) {
        return path != null && !path.isEmpty() && path.startsWith("/");
    }

    public boolean createPath(String path)
    {
        if(!isValidPath(path))
        {
            return false;
        }

        if(path.equals("/"))
            return false;

        String[] components = path.split("/");

        FileSystemNode current = root;

        for(int i=1;i<components.length-1;i++)
        {

            String component = components[i];
            if(component.isEmpty())
                continue;

            if(@current.hasChild(component))
            {
                FileSystemNode newDir = new Directory(component);
                current.addChild(component, newDir);
            
            }
        }
            String lastComponent = components[components.length - 1];
        
        if (lastComponent.isEmpty()) {
            return false;
        }
        
        // Check if already exists
        if (current.hasChild(lastComponent)) {
            System.out.println("❌ Path already exists: " + path);
            return false;
        }
        
        // Create as File if has extension, else Directory
        FileSystemNode newNode;
        if (lastComponent.contains(".")) {
            newNode = new File(lastComponent);
            System.out.println("✅ Created file: " + path);
        } else {
            newNode = new Directory(lastComponent);
            System.out.println("✅ Created directory: " + path);
        }
        
        current.addChild(lastComponent, newNode);
        return true;
    }

    public FileSystemNode getNode(String path)
    {
        if(!isValidPath(path))
            return null;
        
        if(path.equals("/"))
            return root;

        String[] components = path.split("/");
        FileSystemNode current = root;
        for(int i=1;i<components.length();i++)
        {
            current=current.getChild(components);
        }
        return current;
    }

     // ─────────────────────────────────────────────────────────────
    // DELETE PATH
    // ─────────────────────────────────────────────────────────────
    
    /**
     * Delete a path (file or directory)
     * 
     * For directories, also deletes all contents (recursive delete)
     * 
     * @param path Full path to delete
     * @return true if deleted, false otherwise
     */
    public boolean deletePath(String path) {
        if (!isValidPath(path)) {
            System.out.println("❌ Invalid path: " + path);
            return false;
        }
        
        if (path.equals("/")) {
            System.out.println("❌ Cannot delete root directory");
            return false;
        }
        
        // Get parent path
        String parentPath = getParentPath(path);
        FileSystemNode parent = getNode(parentPath);
        
        if (parent == null || parent.isFile()) {
            System.out.println("❌ Parent not found or is a file");
            return false;
        }
        
        // Get the name of node to delete
        String nodeName = path.substring(path.lastIndexOf('/') + 1);
        
        if (!parent.hasChild(nodeName)) {
            System.out.println("❌ Path not found: " + path);
            return false;
        }
        
        boolean removed = parent.removeChild(nodeName);
        if (removed) {
            System.out.println("✅ Deleted: " + path);
        }
        return removed;
    }

    public boolean setFileContent(String path, String content)
    {
        FileSystemNode node = getNode(path);

        File file = (File)node;
        file.setContent(content);
        return true;
    }
}
