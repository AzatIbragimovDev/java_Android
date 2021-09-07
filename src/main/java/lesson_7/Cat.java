package lesson_7;

public class Cat {
    private final String name;
    private final int appetite;
    public boolean satiety = false;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate p) {
       satiety = (p.decreaseFood(appetite));
    }

}
