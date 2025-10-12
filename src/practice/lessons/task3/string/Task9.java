package practice.lessons.task3.string;

//9.	Преобразуйте строку к нижнему регистру.

public class Task9 {
    public static void main(String[] args) {
        run();
    }

    static void run() {
        System.out.println(makeLower("Я ВНАТУРЕ БОЛЬШОЙ"));
    }

    static String makeLower(String input) {
        return input.toLowerCase();
    }
}
