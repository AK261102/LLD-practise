
interface Animal{
    void makeSound();
    void sleep();
}

class Dog implements Animal{
    @Override
    public void makeSound(){
        System.out.println("barkkkkk");
    }
    @Override
    public void sleep(){
        System.out.println("sleeping dogie");
    }
}

class Cat implements Animal{
    @Override
    public void makeSound(){
        System.out.println("mewoowowow");
    }
    @Override
    public void sleep(){
        System.out.println("catie is sleeping");
    }
}
public class AniInterface {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.makeSound();
        d1.sleep();
        Cat c1=new Cat();
        c1.makeSound();;
        c1.sleep();
    }
}
