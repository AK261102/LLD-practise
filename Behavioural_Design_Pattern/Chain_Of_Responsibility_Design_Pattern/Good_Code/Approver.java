package Behavioural_Design_Pattern.Chain_Of_Responsibility_Design_Pattern.Good_Code;

public abstract class Approver {
    
    public Approver app;
    public void setNextApprover(Approver app)
    {
        this.app=app;
    }

    public abstract void processWithLeaveRequest(int leaveDays);
}
