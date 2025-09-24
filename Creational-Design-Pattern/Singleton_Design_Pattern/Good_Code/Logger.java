package Singleton_Design_Pattern.Good_Code;

public class Logger {
    public static  Logger logger=null;
    private Logger(){}
    public static Logger getLogger(){
        if(logger==null){
            logger=new Logger();
        }
        return logger;
    }
    public void log(String message){
        System.out.println(message);
    }
}
