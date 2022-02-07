package lesson_2;

public class Task_4_1 {
    // Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean task_4_1(int a){
if(a%400==0) return true;
    else if(a%100==0) return false;
       else return a%4==0;

    }
}
