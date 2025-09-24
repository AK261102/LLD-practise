package Singleton_Design_Pattern.Ugly_Code;
 

public class UserService {
    public void login(String username){
        Logger logger = Logger.getInstance();
        logger.log("User"+username);
    }
}
