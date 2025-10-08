package practice.lessons.task2;

import java.util.Scanner;

//11. Ввести число с консоли, которое не заканчивается на 0.
// Вывести среднее значение всех цифр в числе. Использовать оператор %.(цикл while)

public class Task11 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;

        if (n%10 == 0) {
            return;
        }
        while (n>=1) {
            int temp = n%10;
            result += temp;
            n = n/10;
        }

        System.out.println(result);
    }
}
