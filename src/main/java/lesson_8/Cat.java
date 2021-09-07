package lesson_8;

public class Cat implements Entity {
    final int runDistance;
    final double jumpHeight;
    final String name;

    public Cat(int runDistance, double jumpHeight, String name) {
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.name = name;
    }
    @Override
    public boolean run(int getTrackDistance) {
        if(runDistance >= getTrackDistance) {
            System.out.println("The Cat is runing...");
            return true;
        }
        System.out.println("The Cat is failed run...");
        return false;
    }

    @Override
    public boolean jump(double getWallHeight) {
        if(jumpHeight >= getWallHeight) {
            System.out.println("The Cat is jumping...");
            return true;
        }
        System.out.println("The Cat is failed jump...");
        return false;
    }
}