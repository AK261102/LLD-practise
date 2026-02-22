package ASHISH_CODE_HIMSELF.Concurrency;

public class Counter {
    int cnt=0;
    synchronized void start()
    {
        cnt++;
    }
}
