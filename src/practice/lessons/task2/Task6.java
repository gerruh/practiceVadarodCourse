package practice.lessons.task2;


//6. Вывести только нечётные числа от 1 до 100.


public class Task6 {
    public static void main(String[] args) {
        run2();
    }

    //for
    public static void run() {
        for (int i = 1; i <= 100; i ++) {
            if (i%2!=0) {
                System.out.println(i);
            }
        }
    }

    //while
    public static void run2() {
        int i = 0;
        while (i<=100) {
            if (i%2!=0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
