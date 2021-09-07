package lesson_8;

public class Robot implements Entity{
    final int runDistance;
    final double jumpHeight;
    final String name;
    public Robot(int runDistance, double jumpHeight, String name) {
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.name = name;
    }

    @Override
    public boolean run(int getTrackDistance) {
        if(runDistance >= getTrackDistance) {
            System.out.println("The Robot is runing...");
            return true;
        }
        System.out.println("The Robot is failed run...");
        return false;
    }
    @Override
    public boolean jump(double getWallHeight) {
        if(jumpHeight >= getWallHeight) {
            System.out.println("The Robot is jumping...");
            return true;
        }
        System.out.println("The Robot is failed jump...");
        return false;
    }

}
