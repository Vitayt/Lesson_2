package lesson_2;

public class Task_9 {
    //  * Написать метод, принимающий на вход два аргумента: len и initialValue,
    //  и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static void task_9(int len, int initialValue){
        int [] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
            System.out.print(array[i]+" ");
        }
    }
}
