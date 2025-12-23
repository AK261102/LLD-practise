package PRACTISE.Tic_Tac_Toe;


Game · JAVA
Copy

/**
 * ╔══════════════════════════════════════════════════════════════════╗
 * ║                      STEP 6: GAME CLASS                          ║
 * ╠══════════════════════════════════════════════════════════════════╣
 * ║                                                                  ║
 * ║  Game = The CONTROLLER that runs everything                     ║
 * ║                                                                  ║
 * ║  Think of it as the "referee" of the game:                       ║
 * ║  ├── Creates the board                                           ║
 * ║  ├── Manages player turns                                        ║
 * ║  ├── Validates moves                                             ║
 * ║  ├── Checks for winner/draw                                      ║
 * ║  └── Announces the result                                        ║
 * ║                                                                  ║
 * ║  GAME FLOW:                                                      ║
 * ║                                                                  ║
 * ║    START                                                         ║
 * ║      │                                                           ║
 * ║      ▼                                                           ║
 * ║  ┌─────────┐                                                     ║
 * ║  │Show     │◄─────────────────┐                                  ║
 * ║  │Board    │                  │                                  ║
 * ║  └────┬────┘                  │                                  ║
 * ║       │                       │                                  ║
 * ║       ▼                       │                                  ║
 * ║  ┌─────────┐                  │                                  ║
 * ║  │Get Move │                  │                                  ║
 * ║  │from     │                  │                                  ║
 * ║  │Player   │                  │                                  ║
 * ║  └────┬────┘                  │                                  ║
 * ║       │                       │                                  ║
 * ║       ▼                       │                                  ║
 * ║  ┌─────────┐   Invalid        │                                  ║
 * ║  │Validate │───────────────────                                  ║
 * ║  │Move     │                  │                                  ║
 * ║  └────┬────┘                  │                                  ║
 * ║       │ Valid                 │                                  ║
 * ║       ▼                       │                                  ║
 * ║  ┌─────────┐                  │                                  ║
 * ║  │Make     │                  │                                  ║
 * ║  │Move     │                  │                                  ║
 * ║  └────┬────┘                  │                                  ║
 * ║       │                       │                                  ║
 * ║       ▼                       │                                  ║
 * ║  ┌─────────┐   No             │                                  ║
 * ║  │Winner?  │──────────────────┤                                  ║
 * ║  └────┬────┘                  │                                  ║
 * ║       │ Yes                   │                                  ║
 * ║       ▼                       │                                  ║
 * ║  ┌─────────┐   No             │                                  ║
 * ║  │Draw?    │──► Switch Player─┘                                  ║
 * ║  └────┬────┘                                                     ║
 * ║       │ Yes                                                      ║
 * ║       ▼                                                          ║
 * ║     END                                                          ║
 * ║                                                                  ║
 * ╚══════════════════════════════════════════════════════════════════╝
 */

public class Game {
    
}
