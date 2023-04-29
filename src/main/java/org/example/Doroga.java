package org.example;

public class Doroga implements Obstacle{
    public int maxLength;
    @Override
    public String passing(Entity entity) {
        return entity.run(maxLength);
    }

    public Doroga(int maxLength) {
        this.maxLength = maxLength;
    }
}
