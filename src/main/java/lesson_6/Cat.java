package lesson_6;

public class Cat extends Animal {
    public Cat(int runDistance, int swimDistance, String name) {
        super(runDistance, swimDistance, name);
    }
    public void run (int trackDistance) {
        if(getRunDistance() >= trackDistance ) {
            System.out.printf("%s пробежал %s метров \n",name, getRunDistance());
        } else
            System.out.printf("%s не смог пробежать %s метров \n",name, trackDistance);

    }
    public void swim (int poolDistance) {
        if(getSwimDistance() >= poolDistance ) {
            System.out.printf("%s проплыл %s метров \n",name, getSwimDistance());
        } else
            System.out.printf("%s не смог проплыть %s метров \n",name, poolDistance);
    }

}
