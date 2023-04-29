package org.example;

public class Stena implements Obstacle{
    public int maxHeight;
    @Override
    public String passing(Entity entity) {
        return entity.jump(maxHeight);
    }

    public Stena(int maxHeight) {
        this.maxHeight = maxHeight;
    }
}
