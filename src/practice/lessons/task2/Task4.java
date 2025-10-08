package practice.lessons.task2;

/*
Вывести числа от 100 до 1 через запятую. В конце не должно быть запятой
 */

public class Task4 {
    public static void main(String[] args) {
        run2();
    }

    //for
    public static void run() {
        String numbers = "";

        for (int i = 100; i >= 1; i--) {
            if (i==1) {
                numbers += i;
                break;
            }
            numbers += i + ",";
        }

        System.out.println(numbers);
    }

    //while
    public static void run2() {
        String numbers = "";
        int counter = 100;

        while (counter >= 1) {
            if (counter==1) {
                numbers += counter;
                break;
            }
            numbers += counter + ",";
            counter--;
        }

        System.out.println(numbers);
    }
}
