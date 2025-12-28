package PRACTISE.Logging_System.handlers;

import PRACTISE.Logging_System.core.Logmessage;
import PRACTISE.Logging_System.formatters.Logformatter;

/**
 * ══════════════════════════════════════════════════════════════════
 *              STEP 4: LOG HANDLER (STRATEGY PATTERN)
 * ══════════════════════════════════════════════════════════════════
 * 
 *                ⭐ STRATEGY PATTERN ⭐
 * 
 * WHY STRATEGY FOR HANDLER?
 * ─────────────────────────
 * Different destinations for logs:
 *   - Console: For development/debugging
 *   - File: For persistent storage
 *   - Database: For searchable logs
 *   - Network: For centralized logging (ELK, Splunk)
 * 
 * Strategy allows multiple handlers simultaneously!
 * 
 * 
 * STRUCTURE:
 * ──────────
 *       ┌────────────────────────┐
 *       │     LogHandler         │
 *       │     (Interface)        │
 *       └───────────┬────────────┘
 *                   │
 *       ┌───────────┼───────────┬───────────┐
 *       ▼           ▼           ▼           ▼
 *  ┌─────────┐ ┌─────────┐ ┌─────────┐ ┌─────────┐
 *  │ Console │ │  File   │ │Database │ │ Custom  │
 *  │ Handler │ │ Handler │ │ Handler │ │ Handler │
 *  └─────────┘ └─────────┘ └─────────┘ └─────────┘
 */


public interface Loghandler {

    void log(Logmessage message);

    void setFormatter(Logformatter formatter);
    
}
