package Structural-Design-Patterns.FlyWeight Design Pattern.Bad Code;


import java.util.ArrayList;
import java.util.List;

// Game.java
public class Game {
    public static void main(String[] args) {
        List<Particle> particles = new ArrayList<>();
        // Create thousands of particles
        for (int i = 0; i < 10; i++) {
            particles.add(new Particle("red", "explosion.png",
                    (float) Math.random() * 100, (float) Math.random() * 100, 1.0f));
        }

        // Update all particles
        for (Particle particle : particles) {
            particle.update();
        }
    }
}
