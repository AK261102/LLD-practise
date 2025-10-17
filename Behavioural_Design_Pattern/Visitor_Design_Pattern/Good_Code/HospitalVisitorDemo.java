package Behavioural_Design_Pattern.Visitor_Design_Pattern.Good_Code;

import Behavioural_Design_Pattern.Visitor_Design_Pattern.Good_Code.Concrete_Patients.AdultPatient;
import Behavioural_Design_Pattern.Visitor_Design_Pattern.Good_Code.Concrete_Patients.ChildPatient;
import Behavioural_Design_Pattern.Visitor_Design_Pattern.Good_Code.Concrete_Patients.SeniorPatient;
import Behavioural_Design_Pattern.Visitor_Design_Pattern.Good_Code.Concrete_Visitors.BillingVisitor;
import Behavioural_Design_Pattern.Visitor_Design_Pattern.Good_Code.Concrete_Visitors.DiagonsisVisitor;
import Behavioural_Design_Pattern.Visitor_Design_Pattern.Good_Code.Interfaces.Patient;
import Behavioural_Design_Pattern.Visitor_Design_Pattern.Good_Code.Interfaces.Visitor;

public class HospitalVisitorDemo {
    public static void main(String[] args) {
        Patient [] patients={new AdultPatient(),new ChildPatient(),new SeniorPatient()};
        Visitor diagonsisVistor=new DiagonsisVisitor();
        Visitor billingVisitor=new BillingVisitor();

        for(Patient patient:patients)
        {
            patient.accept(billingVisitor);
            patient.accept(diagonsisVistor);
        }
    }
}
