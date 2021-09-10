/*1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, при подаче массива
 другого размера необходимо бросить исключение MyArraySizeException.
 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
 Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
 должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
 3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException,
 и вывести результат расчета.*/

package lesson_9;

        public class Main {
            public static void main(String[] args) {

                String [][] array = new String [][] {
                        {"1", "2", "3", "4"},
                        {"1", "2", "3", "4"},
                        {"1", "2", "3", "4"},
                        {"1", "2", "3", "4"}
                };
                try {
                    try {
                        int result = workWithArray(array);
                        System.out.println(result);
                    } catch (MyArraySizeException e) {
                        System.out.println("Array out of bound");
                    }
                }
                catch (MyArrayDataException e) {
                    System.out.println("Not current array element");
                    System.out.println("Please enter current value in: " + (e.i+1) + "x" + (e.j+1));
                }

            }
            public static int workWithArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
                int sumArr = 0;
                if(array.length != 4) {
                    throw new MyArraySizeException();
                }
                for(int i = 0; i < array.length; i++) {
                    if (array[i].length != 4) {
                        throw new MyArraySizeException();
                    }
                    for (int j = 0; j < array[j].length; j++) {
                        try {
                            sumArr += Integer.parseInt(array[i][j]);
                        } catch (NumberFormatException e) {
                            throw new MyArrayDataException(i, j);
                        }
                    }
                }
                return sumArr;
            }
        }
