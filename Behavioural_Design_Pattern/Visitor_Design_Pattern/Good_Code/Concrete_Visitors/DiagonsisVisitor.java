package Behavioural_Design_Pattern.Visitor_Design_Pattern.Good_Code.Concrete_Visitors;

import Behavioural_Design_Pattern.Visitor_Design_Pattern.Good_Code.Concrete_Patients.AdultPatient;
import Behavioural_Design_Pattern.Visitor_Design_Pattern.Good_Code.Concrete_Patients.ChildPatient;
import Behavioural_Design_Pattern.Visitor_Design_Pattern.Good_Code.Concrete_Patients.SeniorPatient;
import Behavioural_Design_Pattern.Visitor_Design_Pattern.Interfaces.Visitor;
import Behavioural_Design_Pattern.Visitor_Design_Pattern.Concrete_Patients.*;

public class DiagonsisVisitor implements Visitor {
    @Override
    public void visit(AdultPatient adultPatient)
    {
        System.out.println("Adult patient diagonsis");
    }
    @Override
    public void visit(ChildPatient childPatient)
    {
        System.out.println("Child patient diagonsis");
    }
    @Override
    public void visit(SeniorPatient seniorPatient)
    {
        System.out.println("Senior patient diagonsis");
    }
}
