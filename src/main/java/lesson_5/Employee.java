package lesson_5;

public class Employee {
    private String name;
    private String post;
    private int telefonNumber;
    private double salary;
    private int age;

    public Employee(String name, String post, int telefonNumber, double salary, int age) {
        this.name = name;
        this.post = post;
        this.telefonNumber = telefonNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void info() {
        System.out.printf("Full name: %s, Post: %s, Telefon number: %s, Salary = %s, Age = %s ",name, post, telefonNumber, salary, age);
        System.out.println();
    }

}
