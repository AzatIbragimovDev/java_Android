package lesson_8;

public class Main {
    public static void main(String[] args) {
        Entity[] entities = {
                new Human(1500,2.2, "Bob"),
                new Robot(1000,3.1, "Wally"),
                new Cat(300, 1.5,"Bysinka"),
        };
        Obstacle[]obstacles = {
                new Track(1200),
                new Wall(2.23),
        };
        playersGo(entities,obstacles);
    }
    public static void playersGo(Entity[]entities, Obstacle[]obstacles) {
        for (Entity entity : entities) {
            for (Obstacle obstacle : obstacles) {
                obstacle.passingTheObstacle(entity);
            }

        }
    }
}
