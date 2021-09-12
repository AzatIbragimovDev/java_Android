package lesson_8;

public class Track implements Obstacle{
    private int trackDistance;

    public Track(int trackDistance) {
        this.trackDistance = trackDistance;
    }
    public int getTrackDistance() {
        return trackDistance;
    }

    @Override
    public boolean passingTheObstacle(Entity entities) {
        entities.run(trackDistance);
        return true;
    }
}