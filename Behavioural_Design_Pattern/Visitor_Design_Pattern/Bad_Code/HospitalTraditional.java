package Behavioural_Design_Pattern.Visitor_Design_Pattern.Bad_Code;

import Behavioural_Design_Pattern.Visitor_Design_Pattern.Bad_Code.Concrete_Patients.AdultPatient;
import Behavioural_Design_Pattern.Visitor_Design_Pattern.Bad_Code.Concrete_Patients.ChildPatient;

public class HospitalTraditional {
    public static void main(String[] args) {
        Object patient=new AdultPatient();
        if(patient instanceof AdultPatient)
        {
            ((AdultPatient)patient).billing();
            ((AdultPatient)patient).check();
        }
        else if(patient instanceof ChildPatient)
        {
            ((ChildPatient)patient).check();
            ((ChildPatient)patient).billing();
        }
    }
}

/*
 * instanceof : to check whether the object is the instance of that specific class or not.
 */