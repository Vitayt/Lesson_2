package lesson_2;

public class Task_10 {
    //*** Написать метод, которому на вход подается одномерный массив и число n
    // (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
    // Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    // При каком n в какую сторону сдвиг можете выбирать сами.
    public static void task_10(int[] b, int a) {
        int n = a;
        System.out.println("Полученный массив");
        for (int j = 0; j < b.length; j++) {
            System.out.print(b[j] + " ");
        }
        if (a > 0) {
            while (a != 0) {
                int start = b[0];// значение 0 элемента
                int i = 1;
                for (int k = 0; k < b.length - 1; k++) {
                   b[k] = b[i++];
                }
                b[b.length - 1] = start;
                System.out.println();
                a--;

            }
            System.out.println("Массив сдвинулся на " + n + " элемента влево");
        } else if (a < 0) {
            while (a != 0) {
                int end = b[b.length - 1];
                for (int k = b.length - 1; k != 0; k--) {
                   b[k] = b[k - 1];
                }
                b[0] = end;
                System.out.println("");
                a++;

            }
            System.out.println("Массив сдвинулся на " + n + " элемента вправо");

        } else System.out.println("Массив никуда не сдвинулся а =" + n);
        for (int j = 0; j < b.length; j++) {
            System.out.print(b[j] + " ");
        }

    }

}
