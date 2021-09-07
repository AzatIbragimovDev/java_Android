package lesson_8;

public class Wall implements Obstacle {
    private double wallHeight;

    public Wall(double wallHeight) {
        this.wallHeight = wallHeight;
    }
    public double getWallHeight() {
        return wallHeight;
    }
    @Override
    public boolean passingTheObstacle(Entity entities) {
        return entities.jump(getWallHeight());
    }
}
