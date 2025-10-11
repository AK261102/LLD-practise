package Behavioural_Design_Pattern.Chain_Of_Responsibility_Design_Pattern.Bad_Code;

public class LeaveRequest {
    public static void main(String[] args) {
        int leave=12;
        if(leave<=15)
        {
            if(leave<=3)
            {
                System.out.println("Manger will approve it");
            }
            else
            {
                if(leave>3)
                {
                    System.out.println("Goes to the director");
                }
            }
        }
        else
        {
            System.out.println("Too much leaves");
        }
    }
}
