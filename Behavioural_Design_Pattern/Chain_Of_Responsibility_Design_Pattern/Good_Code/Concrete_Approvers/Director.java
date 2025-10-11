


package Behavioural_Design_Pattern.Chain_Of_Responsibility_Design_Pattern.Good_Code;

import Behavioural_Design_Pattern.Chain_Of_Responsibility_Design_Pattern.Good_Code.Approver;

public class Director extends Approver {
    @Override
    public void processWithLeaveRequest(int leaveDays)
    {
        if(leaveDays<15)
        {
            System.out.println("Done");
        }
        else
        {
            app.processWithLeaveRequest(leaveDays);
        }
    }    
}