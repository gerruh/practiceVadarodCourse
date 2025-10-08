package practice.lessons.task2;

/*
Необходимо вывести следующую последовательность цифр:
1 2 4 8 16 32 64 128 256 512
 */

public class Task2 {
    public static void main(String[] args) {
        run();
    }

    //for
    public static void run() {
       for (int i = 1; i<=512; i+=i) {
           System.out.println(i);
        }
    }

    //while
    public static void run2() {
        int i = 0;

        while (i<512) {
            i+=i;
            System.out.println(i);
        }
    }
}
