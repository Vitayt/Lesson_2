package lesson_2;

public class Task_7 {
    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void task_7(int[] b) {
        for (int i = 0; i < b.length; i++) {
            if (b[i] < 6) b[i] *= 2;
            System.out.print(b[i] + "  ");
        }
        System.out.println();
    }

    public static void read(int[] b) {
        for (int i : b) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }
}