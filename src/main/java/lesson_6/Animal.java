package lesson_6;

public class Animal {
    private int runDistance;
    private int swimDistance;
    String name;

    public Animal(int runDistance, int swimDistance, String name) {
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        this.name = name;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getSwimDistance() {
        return swimDistance;
    }

    public void run (int trackDistance) {

    }
    public  void swim (int pollDistance) {

    }
}
