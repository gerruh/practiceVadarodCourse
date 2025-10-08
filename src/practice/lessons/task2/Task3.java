package practice.lessons.task2;

/*
Написать программу, которая посчитает сумму первых 10 чисел
 */

public class Task3 {
    public static void main(String[] args) {
        run();
    }

    //while
    static void run() {
        int sum = 0;
        int incrementValue = 1;

        while (incrementValue <= 10) {
            sum += incrementValue;
            System.out.println(sum);
            incrementValue++;
        }
    }

    //for
    public static void run2() {
        int result = 0;

        for (int i = 1; i <= 10; i++) {
            result += i;
            System.out.println(result);
        }
    }
}
