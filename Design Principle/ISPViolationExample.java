// Interface Segregation Principle - VIOLATION Example
// Problem: Fat interface that forces classes to implement methods they don't need

interface Worker {
    void work();
    void eat();
    void sleep();
    void attendMeeting();
    void writeCode();
    void testCode();
    void manageTeam();
    void approveTimeOff();
    void conductInterview();
}

// Developer class - forced to implement management methods it doesn't need
class Developer implements Worker {
    @Override
    public void work() {
        System.out.println("Developer: Working on tasks");
    }
    
    @Override
    public void eat() {
        System.out.println("Developer: Having lunch");
    }
    
    @Override
    public void sleep() {
        System.out.println("Developer: Taking a break");
    }
    
    @Override
    public void attendMeeting() {
        System.out.println("Developer: Attending meeting");
    }
    
    @Override
    public void writeCode() {
        System.out.println("Developer: Writing code");
    }
    
    @Override
    public void testCode() {
        System.out.println("Developer: Testing code");
    }
    
    @Override
    public void manageTeam() {
        // Developer doesn't manage team - forced to implement
        throw new UnsupportedOperationException("Developers don't manage teams");
    }
    
    @Override
    public void approveTimeOff() {
        // Developer can't approve time off - forced to implement
        throw new UnsupportedOperationException("Developers can't approve time off");
    }
    
    @Override
    public void conductInterview() {
        System.out.println("Developer: Conducting technical interview");
    }
}

// Manager class - forced to implement coding methods it doesn't need
class Manager implements Worker {
    @Override
    public void work() {
        System.out.println("Manager: Working on management tasks");
    }
    
    @Override
    public void eat() {
        System.out.println("Manager: Having lunch");
    }
    
    @Override
    public void sleep() {
        System.out.println("Manager: Taking a break");
    }
    
    @Override
    public void attendMeeting() {
        System.out.println("Manager: Leading meeting");
    }
    
    @Override
    public void writeCode() {
        // Manager doesn't write code - forced to implement
        throw new UnsupportedOperationException("Managers don't write code");
    }
    
    @Override
    public void testCode() {
        // Manager doesn't test code - forced to implement
        throw new UnsupportedOperationException("Managers don't test code");
    }
    
    @Override
    public void manageTeam() {
        System.out.println("Manager: Managing team");
    }
    
    @Override
    public void approveTimeOff() {
        System.out.println("Manager: Approving time off request");
    }
    
    @Override
    public void conductInterview() {
        System.out.println("Manager: Conducting behavioral interview");
    }
}

// Robot worker - forced to implement human-specific methods
class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Robot: Performing automated tasks");
    }
    
    @Override
    public void eat() {
        // Robots don't eat - forced to implement
        throw new UnsupportedOperationException("Robots don't eat");
    }
    
    @Override
    public void sleep() {
        // Robots don't sleep - forced to implement
        throw new UnsupportedOperationException("Robots don't sleep");
    }
    
    @Override
    public void attendMeeting() {
        // Robots don't attend meetings - forced to implement
        throw new UnsupportedOperationException("Robots don't attend meetings");
    }
    
    @Override
    public void writeCode() {
        System.out.println("Robot: Generating code automatically");
    }
    
    @Override
    public void testCode() {
        System.out.println("Robot: Running automated tests");
    }
    
    @Override
    public void manageTeam() {
        // Robots don't manage teams - forced to implement
        throw new UnsupportedOperationException("Robots don't manage teams");
    }
    
    @Override
    public void approveTimeOff() {
        // Robots can't approve time off - forced to implement
        throw new UnsupportedOperationException("Robots can't approve time off");
    }
    
    @Override
    public void conductInterview() {
        // Robots don't conduct interviews - forced to implement
        throw new UnsupportedOperationException("Robots don't conduct interviews");
    }
}