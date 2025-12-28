package PRACTISE.Logging_System.core;

import java.time.LocalDateTime;

/**
 * ══════════════════════════════════════════════════════════════════
 *                    STEP 2: LOG MESSAGE CLASS
 * ══════════════════════════════════════════════════════════════════
 * 
 * Data holder for a single log entry.
 * 
 * Contains:
 *   - level: Severity (DEBUG, INFO, WARN, ERROR, FATAL)
 *   - message: The actual log message
 *   - timestamp: When the log occurred
 *   - source: Where the log came from (class name)
 *   - threadName: Which thread logged this
 * 
 * 
 * EXAMPLE LOG MESSAGE:
 * ────────────────────
 *   [2025-01-15 14:30:45] [INFO] [UserService] [main] User logged in
 *        │                  │         │          │          │
 *        timestamp         level    source     thread    message
 */


public class Logmessage {
 
    private final Loglevel timestamp;
    private final String level;
    private final LocalDateTime source;
    private final String thread;
    private final String message;

    public Logmessage(Loglevel level, String message){
        this(level, message, "Application");
    }


    // ─────────────────────────────────────────────────────────────
    // GETTERS
    // ─────────────────────────────────────────────────────────────
    
    public LogLevel getLevel() {
        return level;
    }
    
    public String getMessage() {
        return message;
    }
    
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    
    public String getTimestampFormatted() {
        return timestamp.format(FORMATTER);
    }
    
    public String getSource() {
        return source;
    }
    
    public String getThreadName() {
        return threadName;
    }
    
}
