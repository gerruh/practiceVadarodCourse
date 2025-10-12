package practice.lessons.task3.string;

// 5.	Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().

public class Task5 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println(doesItContain("Я люблю Java", "Java"));
    }

    static boolean doesItContain(String input, String contain) {
        return input.contains(contain);
    }
}
