

package Behavioural_Design_Pattern.Chain_Of_Responsibility_Design_Pattern.Good_Code;

import Behavioural_Design_Pattern.Chain_Of_Responsibility_Design_Pattern.Good_Code.Approver;

public class HR extends Approver{
    @Override
    public void processWithLeaveRequest(int leaveDays)
    {
        System.out.println("Your leave request is proceed with "+leaveDays);
    }
}