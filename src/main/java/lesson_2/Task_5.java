package lesson_2;

public class Task_5 {
    //Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    //int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    public static void task_5(int[] a) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) a[i] = 0;
            else a[i] = 1;
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }
// вывод старого массива
    public static void read(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
