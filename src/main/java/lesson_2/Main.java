        /*
        1.Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        С помощью цикла и условия заменить 0 на 1, 1 на 0;
        2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями
        0 3 6 9 12 15 18 21;
        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
        умножить на 2;
        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
        цикла(-ов) заполнить его диагональные элементы единицами;
        5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
         если в массиве есть место, в котором сумма левой и правой части массива равны.
         Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
         граница показана символами ||, эти символы в массив не входят.
        7. **** Написать метод, которому на вход подается одномерный массив и число n
        (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
         Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
         Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2
         (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
 */
package lesson_2;

public class Main {
    public static void main(String[] args) {
        doTask6(doArray());
        doTask7(doArray(), 2);
    }
    static void doTask1 () {
        int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 1) {
                arr[i] = 1;
            } else {
                arr[i] = 0;}
            System.out.print(arr[i]+ " ");
        }
    }
    static void doTask2() {
        int [] arr = new int[8];
        int val = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = val;
            val += 3;
            System.out.println(arr[i] + " ");
        }
    }
    static void doTask3() {
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i]*2;
            }
            System.out.println(arr[i] + " ");
        }
    }
    static void doTask4() {
        int [][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
              if (i == j) {
                  arr[i][j] = 1;
              } else if ((i + j)== (arr[i].length - 1)) {
                  arr[i][j] = 1;
              }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void doTask5() {
        int valMin = Integer.MAX_VALUE;
        int valMax = Integer.MIN_VALUE;
        int[] arr = {3, 7, -1, 4, -32};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > valMax) {
                valMax = arr[i];
            } else if (arr[i] < valMin) {
                valMin = arr[i];
            }
        }
        System.out.println("Максимальное число = " + valMax + "\nМинимальное число = " + valMin);
    }
    static int[] doArray () {
        int[] matrix = {1, 5, 0, 6};
        return matrix;
    }
    static boolean doTask6(int[] arr) {
        int halfSum;
        int sum = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if ((sum % 2) == 0) {
            halfSum = sum / 2;
            for (int i = 0; i < arr.length; i++) {
                temp += arr[i];
                if (temp == halfSum) {
                    int j = 0;
                    while (j <= i) {
                        System.out.print(arr[j] + " ");
                        j++;
                    }
                    System.out.print(" || ");
                    while (j <= (arr.length - 1)) {
                        System.out.print(arr[j] + " ");
                        j++;
                    }
                }
            } return false;
        }
        return false;
    }
    static void doTask7 (int[]arr, int n) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            arr[i] =

        }


    }
}
