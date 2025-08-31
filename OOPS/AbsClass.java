
abstract class Animal{
    // this is an absract method for unique behaviour
    abstract void makeSound();
    void sleep(){
        System.out.println("Sleeping .........");
    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Barkinggggg");
    }
}

class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("mewowwwww");
    }
}
public class AbsClass {
  public static void main(String[] args) {
     Dog myDog=new Dog();
     myDog.sleep();
     myDog.makeSound();
     Cat myCat=new Cat();
     myCat.sleep();
     myCat.makeSound();
  }  
}
