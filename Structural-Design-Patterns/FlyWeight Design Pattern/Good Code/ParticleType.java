package Structural-Design-Patterns.FlyWeight Design Pattern.Good Code;

public class ParticleType {
    public final String velocity;
    public final String sprite;

    public ParticleType(String velocity,String sprite)
    {
        this.velocity=velocity;
        this.sprite=sprite;
    }

    public void render(int x,int y,String velocity)
    {
        System.out.println("The particle is at= "+x+" "+ y+"and moving with the velocity= "+velocity);
    }
}
