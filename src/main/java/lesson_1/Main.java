package lesson_1;

public class Main {
    public static void main(String[] args) {
        int age = 33;
        double weight = 72.1;
        float cash = 120.009f;
        String name = "Azat";
        boolean mood = false;

        System.out.printf(calculation() + "\n" + checkSum(3, 17) + "\n");
        theNumberPositiveOrNegative(-2);
        System.out.println(theNumberPositiveOrNegative2(2));
        printName("Azat");

    }
    public static float calculation() {
        float a = 1.3f, b = 2.4f, c = 3.5f, d = 4.6f;
        float sum = a * (b + (c / d));
        return sum;
    }
    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }
    public static void theNumberPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.printf("The number is positive \n");
        } else {
            System.out.printf("The number is negative \n");
        }
    }
    public static boolean theNumberPositiveOrNegative2(int a) {
        if (a <= 0) {
           return true;
        }
        return false;
    }
    public static void printName(String name) {
        System.out.println("Привет, " + name);
    }
}
