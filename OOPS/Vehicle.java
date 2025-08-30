class dodo{
    void start(String vehicletype){
        System.out.println(vehicletype);
    }
    void start(String veString,int steep)
    {
        System.out.print(veString);
    }
}
public class Vehicle{
    public static void main(String[] args){
        dodo v1=new dodo();
        v1.start("car");
        v1.start("bike",60);
    }
}