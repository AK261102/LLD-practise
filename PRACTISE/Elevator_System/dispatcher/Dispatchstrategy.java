package PRACTISE.Elevator_System.dispatcher;

import PRACTISE.Elevator_System.core.Request;

/**
 * ══════════════════════════════════════════════════════════════════
 *              STEP 5: DISPATCH STRATEGY (INTERFACE)
 * ══════════════════════════════════════════════════════════════════
 * 
 *                ⭐ STRATEGY PATTERN ⭐
 * 
 * WHY STRATEGY PATTERN?
 * ─────────────────────
 * Different algorithms to select elevator for a request:
 *   - FCFS (First Come First Serve)
 *   - SCAN (Go one direction until end)
 *   - LOOK (Like SCAN but smarter)
 *   - Nearest (Closest elevator)
 * 
 * Each algorithm has pros/cons. Strategy lets us swap easily!
 * 
 * 
 * STRUCTURE:
 * ──────────
 *       ┌────────────────────────┐
 *       │   DispatchStrategy     │
 *       │      (Interface)       │
 *       └───────────┬────────────┘
 *                   │
 *       ┌───────────┼───────────┐
 *       ▼           ▼           ▼
 *  ┌─────────┐ ┌─────────┐ ┌─────────┐
 *  │  FCFS   │ │ SCAN    │ │ Nearest │
 *  │Strategy │ │Strategy │ │Strategy │
 *  └─────────┘ └─────────┘ └─────────┘
 */

public interface Dispatchstrategy {
    
    Elevator selectElevator(List<Elevator> elevators, Request request);

}
