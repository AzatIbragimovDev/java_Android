package lesson_7;

public class Plate {
    private static final int MAXFOOD = 100;
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
       if(food < n) {
           System.out.println("В тарелке недостаточно еды, добавьте корма!");
           food = MAXFOOD;
       } else {
           food -= n;
           return true;
       }
        return false;
    }
    public void info() {
        System.out.println("plate: " + food);
    }

}
