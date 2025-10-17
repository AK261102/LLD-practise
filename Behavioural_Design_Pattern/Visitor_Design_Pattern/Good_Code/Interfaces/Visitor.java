package Behavioural_Design_Pattern.Visitor_Design_Pattern.Good_Code.Interfaces;

import Behavioural_Design_Pattern.Visitor_Design_Pattern.Good_Code.Concrete_Patients.AdultPatient;
import Behavioural_Design_Pattern.Visitor_Design_Pattern.Good_Code.Concrete_Patients.ChildPatient;
import Behavioural_Design_Pattern.Visitor_Design_Pattern.Good_Code.Concrete_Patients.SeniorPatient;

public class Visitor {
    void visit(AdultPatient adultPatient);
    void visit(ChildPatient childPatient);
    void visit(SeniorPatient seniorPatient);
}
