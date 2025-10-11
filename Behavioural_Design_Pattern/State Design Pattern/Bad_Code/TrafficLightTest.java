package Behavioural_Design_Pattern.State Design Pattern.Bad_Code;

public class TrafficLightTest {
    public static void main(String[] args) {
        TrafficLightTest t1=new TrafficLightTest();
        t1.next();
        /*
         * code is tightly coupled and to add new function or feature, we have to decouple and then add it.
         */
    }
}
