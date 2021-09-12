package lesson_5;

public class Main {
    public static void main(String[] args) {
        Employee[] persons = new Employee[5];
        persons[0] = new Employee("Ivanov Ivan", "engineer", 5151675,45221.43,30);
        persons[1] = new Employee("Maksimov Maksim", "engineer", 5152311,50000,39);
        persons[2] = new Employee("Vakin Denis", "manager", 543225,60000,34);
        persons[3] = new Employee("Terre Vladimir", "chief", 515555,70000,45);
        persons[4] = new Employee("Abramov Vladislav", "director", 5153455,100000,49);
        for (int i = 0; i < persons.length; i++) {
            if(persons[i].getAge() >= 40 ) {
                persons[i].info();
            }
        }
    }
}
