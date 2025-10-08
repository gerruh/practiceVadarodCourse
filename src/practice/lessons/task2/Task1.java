package practice.lessons.task2;

/*
Необходимо, чтобы программа отображала следующую последовательность чисел:
7 14 21 28 35 42 49 56 63 70 77 84 91 98
 */

public class Task1 {
    public static void main(String[] args) {
        run();
    }

    //for
    public static void run() {
        for (int i = 0; i<=98; i+=7) {
            System.out.println(i);
        }
    }

    //while
    public static void run2() {
        int i = 0;
        while (i<98) {
            i += 7;
            System.out.println(i);
        }
    }

}
