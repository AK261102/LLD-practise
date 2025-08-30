class Animal{
    void eat()
    {
        System.out.println("animal hu mein");
    }
}

interface Mammal{
    void walk();
}
interface Pet{
    void play();
}

class Dog extends Animal implements Mammal, Pet{
    @Override
    void eat(){
        System.out.println("Eating");
    }
    @Override
    public void walk()
    {
        System.out.println("this dog walks");
    }
    public void play()
    {
        System.out.println("I am walking");
    }
}
public class hyrid {
    public static void main(String [] args)
    {
        Dog dog=new Dog();
        dog.eat();
        dog.walk();
        dog.play();
    }
}
