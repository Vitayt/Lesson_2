package lesson_2;

public class Task_6 {
    //Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void task_6(){
        int[] a ;
        a = new int[100];
        for (int i =0; i < 100; i++) {
            a[i] = i+1;
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
