// Main class to demonstrate Interface Segregation Principle

public class InterfaceSegregationDemo {
    public static void main(String[] args) {
        System.out.println("===== INTERFACE SEGREGATION PRINCIPLE DEMO =====\n");
        
        System.out.println("1. ISP VIOLATION - Fat Interface Problem:");
        System.out.println("------------------------------------------");
        demonstrateViolation();
        
        System.out.println("\n2. ISP PROPER IMPLEMENTATION - Segregated Interfaces:");
        System.out.println("------------------------------------------------------");
        demonstrateProperImplementation();
        
        System.out.println("\n3. KEY BENEFITS OF ISP:");
        System.out.println("------------------------");
        explainBenefits();
    }
    
    private static void demonstrateViolation() {
        System.out.println("\nProblem: All workers must implement ALL methods from Worker interface");
        System.out.println("even if they don't need them, leading to UnsupportedOperationExceptions\n");
        
        Developer dev = new Developer();
        Manager mgr = new Manager();
        RobotWorker robot = new RobotWorker();
        
        // Developer doing developer things - OK
        dev.writeCode();
        dev.testCode();
        
        // Manager doing manager things - OK
        mgr.manageTeam();
        mgr.approveTimeOff();
        
        // Robot doing robot things - OK
        robot.work();
        
        // Problems: Forced implementations that throw exceptions
        System.out.println("\n⚠️ Problems with fat interface:");
        try {
            dev.manageTeam(); // Developer can't manage
        } catch (UnsupportedOperationException e) {
            System.out.println("❌ " + e.getMessage());
        }
        
        try {
            mgr.writeCode(); // Manager doesn't code
        } catch (UnsupportedOperationException e) {
            System.out.println("❌ " + e.getMessage());
        }
        
        try {
            robot.eat(); // Robot doesn't eat
        } catch (UnsupportedOperationException e) {
            System.out.println("❌ " + e.getMessage());
        }
    }
    
    private static void demonstrateProperImplementation() {
        System.out.println("\nSolution: Classes implement only the interfaces they need\n");
        
        BetterDeveloper developer = new BetterDeveloper("Alice");
        BetterManager manager = new BetterManager("Bob");
        BetterRobot robot = new BetterRobot("RoboBot-3000");
        TechLead techLead = new TechLead("Charlie");
        
        System.out.println("Developer capabilities:");
        developer.work();
        developer.writeCode();
        developer.debugCode();
        developer.conductInterview();
        
        System.out.println("\nManager capabilities:");
        manager.work();
        manager.manageTeam();
        manager.assignTasks();
        manager.approveTimeOff();
        
        System.out.println("\nRobot capabilities:");
        robot.work();
        robot.performAutomatedTask();
        robot.writeCode();
        robot.generateReport();
        
        System.out.println("\nTech Lead capabilities (multiple roles):");
        techLead.work();
        techLead.writeCode();
        techLead.manageTeam();
        techLead.conductInterview();
        
        System.out.println("\n✅ No UnsupportedOperationExceptions!");
        System.out.println("✅ Each class implements only what it needs!");
        System.out.println("✅ New interfaces can be added without affecting existing classes!");
    }
    
    private static void explainBenefits() {
        System.out.println("1. High Cohesion: Interfaces are focused on specific behaviors");
        System.out.println("2. Low Coupling: Classes depend only on interfaces they use");
        System.out.println("3. Flexibility: Easy to add new roles without modifying existing ones");
        System.out.println("4. No Dummy Implementations: No need for empty or exception-throwing methods");
        System.out.println("5. Better Testing: Can mock only the interfaces actually used");
        System.out.println("6. Clear Contracts: Each interface represents a specific capability");
        
        System.out.println("\nExample Use Cases:");
        System.out.println("- Workable: Can be used for any entity that performs work");
        System.out.println("- Human: Only for entities that need human behaviors");
        System.out.println("- Programmer: Only for entities that write code");
        System.out.println("- TeamManager: Only for entities with management responsibilities");
        
        System.out.println("\nComposition Example:");
        System.out.println("- Junior Dev: Workable + Human + Programmer");
        System.out.println("- Senior Dev: Workable + Human + Programmer + Interviewer");
        System.out.println("- Tech Lead: Workable + Human + Programmer + TeamManager + Interviewer");
        System.out.println("- Automation: Workable + Automated + Programmer");
    }
}