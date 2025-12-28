package PRACTISE.File_System.nodes;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * ══════════════════════════════════════════════════════════════════
 *            STEP 1: FILE SYSTEM NODE (ABSTRACT CLASS)
 * ══════════════════════════════════════════════════════════════════
 * 
 *                ⭐ COMPOSITE PATTERN ⭐
 * 
 * This is the COMPONENT in Composite Pattern.
 * Both File (Leaf) and Directory (Composite) extend this.
 * 
 * 
 * WHY ABSTRACT?
 * ─────────────
 * Common properties:
 *   - name
 *   - children map
 *   - createdAt, modifiedAt timestamps
 * 
 * Different behavior:
 *   - isFile() → File returns true, Directory returns false
 *   - display() → File shows itself, Directory shows recursively
 * 
 * 
 * CHILDREN MAP:
 * ─────────────
 * Map<String, FileSystemNode>
 *   └── Key: child name
 *   └── Value: child node (File or Directory)
 * 
 * WHY Map?
 *   - O(1) lookup by name
 *   - easy to check whether the child exists
 * 
 */

public abstract class FileSystemNode {
    
    private String name;
    private Map<String, FileSystemNode> children;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public FileSystemNode(String name)
    {
        this.name=name;
        this.children = new HashMap<>();
        this.createdAt=LocalDateTime.now();
        this.modifiedAt=LocalDateTime.now();
    }

    public abstract boolean isFile();

    public abstract void display(int depth);

    public void addChild(String childName, FileSystemNode child)
    {
        children.put(childName,child);
          updateModifiedTime();
    }
     /**
     * Check if child exists
     */
    public boolean hasChild(String childName) {
        return children.containsKey(childName);
    }
    
    /**
     * Get child by name
     */
    public FileSystemNode getChild(String childName) {
        return children.get(childName);
    }
    
    /**
     * Remove child by name
     */
    public boolean removeChild(String childName) {
        if (hasChild(childName)) {
            children.remove(childName);
            updateModifiedTime();
            return true;
        }
        return false;
    }
    
    /**
     * Get all children
     */
    public Collection<FileSystemNode> getChildren() {
        return children.values();
    }
    
    /**
     * Get children count
     */
    public int getChildrenCount() {
        return children.size();
    }
    
    // ─────────────────────────────────────────────────────────────
    // TIMESTAMP MANAGEMENT
    // ─────────────────────────────────────────────────────────────
    
    /**
     * Update modification time
     */
    protected void updateModifiedTime() {
        this.modifiedAt = LocalDateTime.now();
    }
    
    // ─────────────────────────────────────────────────────────────
    // GETTERS
    // ─────────────────────────────────────────────────────────────
    
    public String getName() {
        return name;
    }
    
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    
    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }
    
    public String getCreatedAtFormatted() {
        return createdAt.format(FORMATTER);
    }
    
    public String getModifiedAtFormatted() {
        return modifiedAt.format(FORMATTER);
    }
    
    // ─────────────────────────────────────────────────────────────
    // HELPER FOR DISPLAY
    // ─────────────────────────────────────────────────────────────
    
    /**
     * Generate indentation string based on depth
     */
    protected String getIndent(int depth) {
        return "  ".repeat(depth);  // 2 spaces per level
    }

}
