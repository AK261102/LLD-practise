package Singleton_Design_Pattern.Ugly_Code;


public class Application {
    public void run(){
        Logger logger = Logger.getInstance();
        logger.log("Application");
    }
}
