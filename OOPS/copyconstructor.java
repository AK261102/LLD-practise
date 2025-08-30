class Movie{
    private String title;
    private int duration;

    public Movie(String title,int duration){
        this.title=title;
        this.duration=duration;
    }
    public Movie(Movie other){
        this.title=other.title;
        this.duration=other.duration;
    }
    void displaydetails()
    {
        System.err.println(title+"  "+duration);
    }
}
public class copyconstructor {
    public static void main(String[] args) {
        Movie m1=new Movie("KGF",148);
        Movie copy =new Movie(m1);
        copy.displaydetails();
    }
}
