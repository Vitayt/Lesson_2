package lesson_2;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
// Task_1
        System.out.println(Task_1.task_1(10, 11));
// Task_2
        Task_2.task_2(-2);
// Task_3
        System.out.println(Task_3.task_3(0));
// Task_4
        Task_4.task_4("Я напечаталась ", 2);
//Task_4_1
        System.out.println(Task_4_1.task_4_1(1601));
//Task_5
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        Task_5.read(a);
        Task_5.task_5(a);
//Task_6
        Task_6.task_6();
//Task_7
        int[] b = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 2};

        Task_7.read(b);
        Task_7.task_7(b);
//Task_8
        Task_8.task_8();
//Task_9
        Scanner sc_len = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int len = sc_len.nextInt();
        System.out.println("Введите целое число, которым будет заполнен массив: ");
       int initialValue = sc_len.nextInt();
        Task_9.task_9(len,initialValue);
        System.out.println();
//Task_10
Task_10.task_10(b,2);

    }


}
