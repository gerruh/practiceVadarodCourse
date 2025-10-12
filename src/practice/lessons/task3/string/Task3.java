package practice.lessons.task3.string;

/*
3.	Проверить, заканчивается ли ваша строка подстрокой “java!”. Используем метод String.endsWith().
 */

public class Task3 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        String str1 = "I love Java!";
        System.out.println(str1.endsWith("Java"));
    }
}
