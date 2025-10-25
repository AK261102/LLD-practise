package Structural

import java.util.ArrayList;
import java.util.List;

-Design-Patterns.FlyWeight Design Pattern.Good Code;

public class Game {
    public static void main(String[] args) {
        ParticleTypeFactory factory= new ParticleTypeFactory();
        List<ParticleType> particleTypes=new ArrayList<>();

        particleTypes explosionRedType=factory.getParticleType("Red","xyz.png");
        //create a thousands of particles using flyweight.

        for(int i=0;i<10;i++)
        {
            particleTypes.add(new Particle(explosionType,(float)Math.random()*100,(float)Math.random()*100,1.0f));

        }

        for(Particle p:ParticleType){
            p.update();
        }
    }
}
