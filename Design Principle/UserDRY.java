import java.time.LocalDate;

class User{
    private String username;
    private String email;
    private LocalDate memberSince;
    public User(String username, String email, LocalDate memberSince)
    {
        this.username=username;
        this.email=email;
        this.memberSince=memberSince;
    }
    public String getUserName(){
        return username;
    }
    public String getEmail(){
        return email;
    }
    public LocalDate getMemberSince() { return memberSince; }

    public String getSummary()
    {
        return "this is my code";
    }
}
class generateReport{
    public String getmeramessage(User user){
return "welcome"+user.getSummary();
    }

    public String getmeramemail(User user){
        return "thank you "+user.getMemberSince();
    }
}

public class UserDRY{
    public static void main(String[] args) {
        User u1=new User("Ashish","ak503",LocalDate.of(2025, 5, 10));
        generateReport r1= new generateReport();
        String welcomer=r1.getmeramemail(u1);
        System.out.println("this is my code DRY"+ welcomer);
    }
}