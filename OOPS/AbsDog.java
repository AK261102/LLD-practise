class Dog{
    void makeSound(){
        System.out.println("Bark");
    }
    void sleep(){
        System.out.println("Sleeping....DOG");
    }
}

class Cat{
    void makeSound(){
        System.out.println("Meow");
    }
    void sleep(){
        System.out.println("Sleeping... Cat");
    }
}
public class AbsDog {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.makeSound();
        d1.sleep();
        Cat c1=new Cat();
        c1.makeSound();
        c1.sleep();
    }
}
