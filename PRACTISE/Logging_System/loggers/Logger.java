package PRACTISE.Logging_System.loggers;

import java.util.ArrayList;
import java.util.List;

import PRACTISE.Logging_System.core.Loglevel;
import PRACTISE.Logging_System.core.Logmessage;
import PRACTISE.Logging_System.handlers.Loghandler;

/**
 * ══════════════════════════════════════════════════════════════════
 *                STEP 5: LOGGER (SINGLETON)
 * ══════════════════════════════════════════════════════════════════
 * 
 *                ⭐ SINGLETON PATTERN ⭐
 * 
 * WHY SINGLETON?
 * ──────────────
 * - One global logger instance for entire application
 * - All parts of app use same configuration
 * - Consistent logging across all modules
 * - Thread-safe access
 * 
 * 
 * RESPONSIBILITIES:
 * ─────────────────
 * 1. Check if message should be logged (level filtering)
 * 2. Create LogMessage object
 * 3. Send to all registered handlers
 * 
 * 
 * USAGE:
 * ──────
 *   Logger.getInstance().info("User logged in");
 *   Logger.getInstance().error("Connection failed!");
 */



public class Logger {
    
    private static Logger instance;

    private Loglevel logLevel;
    private List<Loghandler> handlers;
    private final Object lock = new Object();

    private Logger()
    {
        this.logLevel=logLevel.DEBUG;
        this.handlers = new ArrayList<>();
    }

    public static Logger getInstance()
    {
        if(instance==null)
        {
            instance= new Logger();
        }
        return instance;
    }

    public void setLogLevel(LogLevel level)
    {
        this.logLevel=level;
    }

    public void addHandler(Loghandler handler)
    {
        synchronized(lock)
        {
            handlers.add(handler);
        }
    }

    public void removeHandler(Loghandler handler)
    {
        synchronized(lock)
        {
            handlers.remove(handler);
            handler.close();
        }
    }

    public void log(Loglevel level, String source, String message)
    {

        Logmessage logMessage = new Logmessage(level, message,source);
        synchronized(lock){
            for(Loghandler handler:handlers)
            {
                try{
                    handler.log(logMessage);
                }
                catch(Exception e)
                {
                    
                }
            }
        }
    }
      /**
     * Log a message with specified level (uses caller class as source)
     */
    public void log(LogLevel level, String message) {
        log(level, getCallerClassName(), message);
    }
    
    // ─────────────────────────────────────────────────────────────
    // CONVENIENCE METHODS
    // ─────────────────────────────────────────────────────────────
    
    /**
     * Log DEBUG level message
     */
    public void debug(String message) {
        log(LogLevel.DEBUG, getCallerClassName(), message);
    }
    
    public void debug(String source, String message) {
        log(LogLevel.DEBUG, source, message);
    }
    
    /**
     * Log INFO level message
     */
    public void info(String message) {
        log(LogLevel.INFO, getCallerClassName(), message);
    }
    
    public void info(String source, String message) {
        log(LogLevel.INFO, source, message);
    }
    
    /**
     * Log WARN level message
     */
    public void warn(String message) {
        log(LogLevel.WARN, getCallerClassName(), message);
    }
    
    public void warn(String source, String message) {
        log(LogLevel.WARN, source, message);
    }
    
    /**
     * Log ERROR level message
     */
    public void error(String message) {
        log(LogLevel.ERROR, getCallerClassName(), message);
    }
    
    public void error(String source, String message) {
        log(LogLevel.ERROR, source, message);
    }
    
    /**
     * Log ERROR level with exception
     */
    public void error(String message, Throwable throwable) {
        String fullMessage = message + " - Exception: " + throwable.getMessage();
        log(LogLevel.ERROR, getCallerClassName(), fullMessage);
    }
    
    /**
     * Log FATAL level message
     */
    public void fatal(String message) {
        log(LogLevel.FATAL, getCallerClassName(), message);
    }
    
    public void fatal(String source, String message) {
        log(LogLevel.FATAL, source, message);
    }
    
    // ─────────────────────────────────────────────────────────────
    // UTILITY METHODS
    // ─────────────────────────────────────────────────────────────
    
    /**
     * Get the calling class name (for automatic source detection)
     */
    private String getCallerClassName() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        
        // Find the first class that's not Logger or Thread
        for (StackTraceElement element : stackTrace) {
            String className = element.getClassName();
            if (!className.equals(Logger.class.getName()) && 
                !className.equals(Thread.class.getName())) {
                // Return simple class name (without package)
                int lastDot = className.lastIndexOf('.');
                return lastDot > 0 ? className.substring(lastDot + 1) : className;
            }
        }
        return "Unknown";
    }
    
    /**
     * Shutdown the logger (close all handlers)
     */
    public void shutdown() {
        info("Logger", "Shutting down logger...");
        clearHandlers();
    }
}
