package Structural-Design-Patterns.FlyWeight Design Pattern.Good Code;

public class Particle {
    public ParticleType pt;
    public int x;
    public int y;
    public int velocity;

    public Particle(ParticleType pt,int x,int y,int velocity)
    {
        this.pt=pt;
        this.x=x;
        this.y=y;
        this.velocity=velocity;
    }

    public void update(int x,int y,int velocity)
    {
        y+=velocity;
        type.render(x,y,velocity);
    }
}
