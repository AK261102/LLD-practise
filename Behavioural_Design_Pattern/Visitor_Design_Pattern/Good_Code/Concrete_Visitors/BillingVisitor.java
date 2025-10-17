package Behavioural_Design_Pattern.Visitor_Design_Pattern.Good_Code.Concrete_Visitors;

import Behavioural_Design_Pattern.Visitor_Design_Pattern.Interfaces.Visitor;
import Behavioural_Design_Pattern.Visitor_Design_Pattern.Concrete_Patients.*;
import Behavioural_Design_Pattern.Visitor_Design_Pattern.Good_Code.Concrete_Patients.AdultPatient;
import Behavioural_Design_Pattern.Visitor_Design_Pattern.Good_Code.Concrete_Patients.ChildPatient;
import Behavioural_Design_Pattern.Visitor_Design_Pattern.Good_Code.Concrete_Patients.SeniorPatient;
public class BillingVisitor implements Visitor {

    @Override
    public void visit(AdultPatient adultPatient)
    {
        System.out.println("billling of adult");
    }
    @Override
    public void visit(ChildPatient childPatient)
    {
        System.out.println("Billing of a child patient");
    }
    @Override
    public void visit(SeniorPatient seniorPatient)
    {
        System.out.println("Billing of a senior patient");
    }
}
