package practice.lessons.task3.string;

//8.	Преобразуйте строку к верхнему регистру.

public class Task8 {
    public static void main(String[] args) {
        run();
    }

    static void run() {
        System.out.println(makeUpper("я сильно маленький"));
    }

    static String makeUpper(String input) {
        return input.toUpperCase();
    }
}
