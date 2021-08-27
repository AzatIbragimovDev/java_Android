
        /*1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать
             это число. При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число,
             чем загаданное, или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз?
             1 – да / 0 – нет»(1 – повторить, 0 – нет).
          2. Создать массив из слов:
              При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с
              загаданным словом и сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер
              показывает буквы, которые стоят на своих местах.
              apple – загаданное
              apricot - ответ игрока
              ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
              Для сравнения двух слов посимвольно можно пользоваться:
              String str = "apple";
              char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
              Играем до тех пор, пока игрок не отгадает слово.
              Используем только маленькие буквы.*/

package lesson_3;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        doTask2();

    }
    static void doTask1() {
        Scanner scan = new Scanner(System.in);
        int answer;
        do {
            game();
            System.out.println("Желаете сыграть еще? ");
            answer = scan.nextInt();
            if (answer == 1)
                game();
        } while (answer != 0);
        System.out.println("Спасибо за игру!");
    }

    static boolean game () {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int randValue = random.nextInt(10);
        System.out.println("Отгадайте число от 0 до 9... ");
        int popitka = 3;

        do {
            System.out.println("Введите число: " + "Количество попыток: " + popitka);
            int val = scan.nextInt();
            if (val == randValue) {
                System.out.println("Победа!");
                break;
            } else if(val < randValue) {
                System.out.println("Загаданное число больше.");
            } else {
                System.out.println("Загаданное число меньше. ");
            }
            popitka--;
        }
        while (popitka != 0);
        return true;
    }

    static void doTask2 () {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        String playerWord;
        boolean equalWords;
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int randomIndex = r.nextInt(words.length);
        String word = words[randomIndex];
        System.out.println("Отгадайте слово из " + word.length() + " букв!");

            do {
                playerWord = s.nextLine();
                equalWords = (word.equals(playerWord));
                if (playerWord.length() >= word.length()) {
                    for (int i = 0; i < word.length(); i++) {
                        char wordChar = word.charAt(i);
                        char playerWordChar = playerWord.charAt(i);
                        if (wordChar == playerWordChar) {
                            System.out.print(wordChar);
                        } else {
                            System.out.print('#');
                        }
                    }
                }
                if (word.equals(playerWord)) {
                    System.out.println("  Поздравляем с победой! ");
                } else
                    System.out.print("###############" + "\nНеверно, попробуйте еще раз! \n");
            } while (!equalWords);
    }
}



