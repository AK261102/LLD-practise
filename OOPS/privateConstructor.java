
class Singleton{
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
public class privateConstructor {
    public static void main(String[] args) {
        Singleton s1=Singleton.getInstance();
        System.err.println(s1);
    }
}
