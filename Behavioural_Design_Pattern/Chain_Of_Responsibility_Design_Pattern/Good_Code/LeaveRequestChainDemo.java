package Behavioural_Design_Pattern.Chain_Of_Responsibility_Design_Pattern.Good_Code;



public class LeaveRequestChainDemo {
    public static void main(String[] args) {
        Approver manager=new MAnager();
        Approver HR=new HR();
        Approver director=new Director();

        HR.setNextApprover(manager);
        manager.setNextApprover(director);

        int leave=20;
        HR.processWithLeaveRequest(leave);
    }
    /*
     * Improvement 
     * now there is concrete for the set of Heads in the office
     * Simply add it there 
     * there method are called from abstract class Approver.java and decribed here
     * Different objects are created in the main and called sequentially
     */
}
