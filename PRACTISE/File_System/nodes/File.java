package PRACTISE.File_System.nodes;

/**
 * ══════════════════════════════════════════════════════════════════
 *                    STEP 2: FILE CLASS (LEAF)
 * ══════════════════════════════════════════════════════════════════
 * 
 * File is a LEAF in Composite Pattern.
 * It cannot have children - it's the end of the path.
 * 
 * UNIQUE PROPERTIES:
 *   - content: The actual file content
 *   - extension: File type (.txt, .java, .md)
 * 
 * 
 * FILE DETECTION:
 * ───────────────
 * If name contains ".", it's a file:
 *   report.txt  → File
 *   notes       → Directory
 */
public class File {
    
    private String content;
    private String extension;

    public File(String name)
    {
        super(name);
        this.content="";
        this.extension=extractExtension(name);
    }

    private String extractExtension(String name)
    {
        int dotIndex = name.lastIndexOf('.');
        if(dotIndex > 0 && dotIndex < name.length()-1)
            return name.substring(dotIndex+1;);
        return "";
    }

    public void setContent(String content)
    {
        this.content =content;

    }

    /**
     * Get file content
     */
    public String getContent() {
        return content;
    }
    
    /**
     * Get file extension
     */
    public String getExtension() {
        return extension;
    }
    
    /**
     * Get content size in characters
     */
    public int getSize() {
        return content != null ? content.length() : 0;
    }

    @Override
    public boolean isFile()
    {
        return true;
    }

    @Override
    public void display(int depth)
    {
        String intent = getIndent(depth);
    }
}
