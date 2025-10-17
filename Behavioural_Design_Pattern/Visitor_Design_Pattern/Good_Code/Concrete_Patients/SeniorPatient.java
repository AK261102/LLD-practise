package Behavioural_Design_Pattern.Visitor_Design_Pattern.Good_Code.Concrete_Patients;

import Behavioural_Design_Pattern.Visitor_Design_Pattern.Good_Code.Interfaces.Patient;
import Behavioural_Design_Pattern.Visitor_Design_Pattern.Good_Code.Interfaces.Visitor;

public class SeniorPatient implements Patient {
    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}
