package Behavioural_Design_Pattern.State Design Pattern.Good_Code;

public class TrafficLightTest {
    public static void main(String[] args) {
        TrafficLightContext t1=new TrafficLightContext();
        t1.next();
        t1.next();
        /*
         * My Thought for the implement right now
         * Traffic Light State java has next() and getColor
         * this interface behaviour is used om TrafficLightContext where we are defining the behaviour
         * we are adding the stated in the concrete States
         */
        // Adding new states like BLINKING or MAINTENANCE is easy now
    }
}
