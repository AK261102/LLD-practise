package ASHISH_CODE_HIMSELF.Java_Practise.First_Code;

public class Vehicle {
    private String vehicle;
    private int licensePlate;

    public Vehicle(String vehicle, int licensePlate)
    {
        this.vehicle=vehicle;
        this.licensePlate=licensePlate;
    }

    public int getLiscenePlate()
    {
        return licensePlate;
    }

    public String getVehicleName()
    {
        return vehicle;
    }
}


/**
 * 
 * how to create an objects
 * Vehicle v1  = new Vehicle("BMW",199192);
 * main is inside a class, always public static void main(String[] args)
System.out.println() instead of cout
String is a class (capital S), not string
List<String> not List<string> — generics use wrapper types
No #include — use import
File name MUST match public class name: Main.java. 
ALL objects are on heap (created with new)
NO stack-allocated objects (primitives like int, boolean ARE on stack)
NO destructor — Java has garbage collection
this is a reference to current object (like this pointer in C++)
One public class per file, file name must match class name
 */