package lesson_6;

public class AnimalEvent {

    public static void start() {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat(200,0, "Barsik");
        animals[1] = new Dog(500,10, "Polkan");
        animals[2] = new Dog(550,10, "Myhtar");
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(300);
            animals[i].swim(5);
        }
        System.out.printf("The number of participants = " + animals.length);
    }
}
