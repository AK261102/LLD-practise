package Structural

import java.util.HashMap;

-Design-Patterns.FlyWeight Design Pattern.Good Code;

public class ParticleTypeFactory {
    private Map<String, ParticleType> ParticleType=new HashMap<>();

    public ParticleType getParticleType(String color,String sprite)
    {
        /**
         * If the key is absent: uses the lambda (k -> new ParticleType(color, sprite)) to create a new ParticleType with the given color and sprite, adds it to the map for this key, and returns the new object.
         * In short:
         */
        String key=color+"--"+sprite;
           return particleTypes.computeIfAbsent(key, k -> new ParticleType(color, sprite));
    }
    
}
