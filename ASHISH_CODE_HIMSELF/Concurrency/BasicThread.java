package ASHISH_CODE_HIMSELF.Concurrency;

public class BasicThread {
    public static void main(String[] args) throws Exception {
        Counter counter = new Counter();

        Thread t1 = new Thread( () ->{
            for(int i=0;i<1000;i++)
            {
                counter.start();
            }
        });

         Thread t2 = new Thread( () ->{
            for(int i=0;i<1000;i++)
            {
                counter.start();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

         System.out.println("Final count: " + counter.cnt);
    }
}
