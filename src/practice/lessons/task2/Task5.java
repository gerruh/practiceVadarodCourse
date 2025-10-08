package practice.lessons.task2;

//Вывести числа от 1 до 100. (while)

public class Task5 {
    public static void main(String[] args) {
        run();
    }

    //for
    public static void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    //while
    public static void run2() {
        int i = 0;
        while (i<=100) {
            System.out.println(i);
        }
    }
}
