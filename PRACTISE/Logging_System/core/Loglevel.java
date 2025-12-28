package PRACTISE.Logging_System.core;


/**
 * ══════════════════════════════════════════════════════════════════
 *                      STEP 1: LOG LEVEL ENUM
 * ══════════════════════════════════════════════════════════════════
 * 
 * Represents severity levels for log messages.
 * 
 * PRIORITY ORDER (lowest to highest severity):
 *   DEBUG (0) → INFO (1) → WARN (2) → ERROR (3) → FATAL (4)
 * 
 * 
 * LEVEL FILTERING:
 * ────────────────
 * If logger is set to WARN (2):
 *   - DEBUG (0) → NOT logged (0 < 2)
 *   - INFO (1)  → NOT logged (1 < 2)
 *   - WARN (2)  → Logged (2 >= 2)
 *   - ERROR (3) → Logged (3 >= 2)
 *   - FATAL (4) → Logged (4 >= 2)
 */


public enum Loglevel {
    

    DEBUG(0, "DEBUG");
    INFO(1, "INFO");
    WARN(2, "WARN");
    ERROR(3, "ERROR");
    FATAL(4, "FATAL");


    private final int value;
    private final String label;

    Loglevel(int value, String label)
    {
        this.value=value;
        this.label=label;
    }

     // ─────────────────────────────────────────────────────────────
    // GETTERS
    // ─────────────────────────────────────────────────────────────
    
    public int getValue() {
        return value;
    }
    
    public String getLabel() {
        return label;
    }
    
    // ─────────────────────────────────────────────────────────────
    // COMPARISON METHODS
    // ──

    public boolean isAtLeast(LogLevel other)
    {
        return this.value >= other.value;
    }
}
