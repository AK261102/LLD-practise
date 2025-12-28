package PRACTISE.File_System.nodes;

public class Directory extends FileSystemNode {

    public Directory(String name)
    {
        super(name);
    }

    @Override
    public boolean isFile()
    {
        return false;
    }

    @Override
    public void display(int depth)
    {
        String indent = getIndent(depth);

        for(FileSystemNode child: getChildren())
        {
            child.display(depth);
        }
    }
    

     // ─────────────────────────────────────────────────────────────
    // DIRECTORY-SPECIFIC METHODS
    // ─────────────────────────────────────────────────────────────
    
    /**
     * Check if directory is empty
     */
    public boolean isEmpty() {
        return getChildrenCount() == 0;
    }
    
    /**
     * Get count of files (not directories) in this directory
     */
    public int getFileCount() {
        int count = 0;
        for (FileSystemNode child : getChildren()) {
            if (child.isFile()) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Get count of subdirectories in this directory
     */
    public int getDirectoryCount() {
        int count = 0;
        for (FileSystemNode child : getChildren()) {
            if (!child.isFile()) {
                count++;
            }
        }
        return count;
    }
    
}
