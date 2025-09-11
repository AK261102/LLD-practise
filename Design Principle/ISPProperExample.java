// Interface Segregation Principle - PROPER Implementation
// Solution: Segregated interfaces that allow classes to implement only what they need

// Base interfaces for common behaviors
interface Workable {
    void work();
}

interface Human {
    void eat();
    void sleep();
}

interface Attendee {
    void attendMeeting();
}

// Role-specific interfaces
interface Programmer {
    void writeCode();
    void testCode();
    void debugCode();
}

interface TeamManager {
    void manageTeam();
    void approveTimeOff();
    void assignTasks();
}

interface Interviewer {
    void conductInterview();
    void evaluateCandidate();
}

interface Automated {
    void performAutomatedTask();
    void generateReport();
}

// Developer implements only relevant interfaces
class BetterDeveloper implements Workable, Human, Attendee, Programmer, Interviewer {
    private String name;
    
    public BetterDeveloper(String name) {
        this.name = name;
    }
    
    @Override
    public void work() {
        System.out.println(name + " (Developer): Working on development tasks");
    }
    
    @Override
    public void eat() {
        System.out.println(name + " (Developer): Having lunch");
    }
    
    @Override
    public void sleep() {
        System.out.println(name + " (Developer): Taking a rest");
    }
    
    @Override
    public void attendMeeting() {
        System.out.println(name + " (Developer): Attending team meeting");
    }
    
    @Override
    public void writeCode() {
        System.out.println(name + " (Developer): Writing clean code");
    }
    
    @Override
    public void testCode() {
        System.out.println(name + " (Developer): Writing unit tests");
    }
    
    @Override
    public void debugCode() {
        System.out.println(name + " (Developer): Debugging issues");
    }
    
    @Override
    public void conductInterview() {
        System.out.println(name + " (Developer): Conducting technical interview");
    }
    
    @Override
    public void evaluateCandidate() {
        System.out.println(name + " (Developer): Evaluating technical skills");
    }
}

// Manager implements management-specific interfaces
class BetterManager implements Workable, Human, Attendee, TeamManager, Interviewer {
    private String name;
    
    public BetterManager(String name) {
        this.name = name;
    }
    
    @Override
    public void work() {
        System.out.println(name + " (Manager): Working on management tasks");
    }
    
    @Override
    public void eat() {
        System.out.println(name + " (Manager): Having business lunch");
    }
    
    @Override
    public void sleep() {
        System.out.println(name + " (Manager): Taking a break");
    }
    
    @Override
    public void attendMeeting() {
        System.out.println(name + " (Manager): Leading strategic meeting");
    }
    
    @Override
    public void manageTeam() {
        System.out.println(name + " (Manager): Managing team performance");
    }
    
    @Override
    public void approveTimeOff() {
        System.out.println(name + " (Manager): Approving vacation request");
    }
    
    @Override
    public void assignTasks() {
        System.out.println(name + " (Manager): Assigning tasks to team members");
    }
    
    @Override
    public void conductInterview() {
        System.out.println(name + " (Manager): Conducting behavioral interview");
    }
    
    @Override
    public void evaluateCandidate() {
        System.out.println(name + " (Manager): Evaluating cultural fit");
    }
}

// Robot implements only automation interfaces
class BetterRobot implements Workable, Automated, Programmer {
    private String model;
    
    public BetterRobot(String model) {
        this.model = model;
    }
    
    @Override
    public void work() {
        System.out.println(model + " (Robot): Executing automated workflows");
    }
    
    @Override
    public void performAutomatedTask() {
        System.out.println(model + " (Robot): Performing scheduled automation");
    }
    
    @Override
    public void generateReport() {
        System.out.println(model + " (Robot): Generating performance report");
    }
    
    @Override
    public void writeCode() {
        System.out.println(model + " (Robot): Auto-generating code from templates");
    }
    
    @Override
    public void testCode() {
        System.out.println(model + " (Robot): Running automated test suite");
    }
    
    @Override
    public void debugCode() {
        System.out.println(model + " (Robot): Running static analysis");
    }
}

// Tech Lead implements multiple interfaces as needed
class TechLead implements Workable, Human, Attendee, Programmer, TeamManager, Interviewer {
    private String name;
    
    public TechLead(String name) {
        this.name = name;
    }
    
    @Override
    public void work() {
        System.out.println(name + " (Tech Lead): Balancing coding and leadership");
    }
    
    @Override
    public void eat() {
        System.out.println(name + " (Tech Lead): Quick lunch at desk");
    }
    
    @Override
    public void sleep() {
        System.out.println(name + " (Tech Lead): Power nap between meetings");
    }
    
    @Override
    public void attendMeeting() {
        System.out.println(name + " (Tech Lead): Attending architecture review");
    }
    
    @Override
    public void writeCode() {
        System.out.println(name + " (Tech Lead): Writing critical system components");
    }
    
    @Override
    public void testCode() {
        System.out.println(name + " (Tech Lead): Reviewing and testing team's code");
    }
    
    @Override
    public void debugCode() {
        System.out.println(name + " (Tech Lead): Debugging complex issues");
    }
    
    @Override
    public void manageTeam() {
        System.out.println(name + " (Tech Lead): Mentoring team members");
    }
    
    @Override
    public void approveTimeOff() {
        System.out.println(name + " (Tech Lead): Approving PTO requests");
    }
    
    @Override
    public void assignTasks() {
        System.out.println(name + " (Tech Lead): Distributing sprint tasks");
    }
    
    @Override
    public void conductInterview() {
        System.out.println(name + " (Tech Lead): Leading technical interview");
    }
    
    @Override
    public void evaluateCandidate() {
        System.out.println(name + " (Tech Lead): Assessing technical and team fit");
    }
}