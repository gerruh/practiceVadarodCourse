package practice.lessons.task2;

//7. Вывести каждый десяток от 1 до 100.


public class Task7 {
    public static void main(String[] args) {
        run2();
    }

    //for
    public static void run() {
        for (int i = 0; i <= 100; i+=10) {
            System.out.println(i);
        }
    }

    //while
    public static void run2() {
        int i = 0;

        while (i<100) {
            i+=10;
            System.out.println(i);
        }
    }
}
