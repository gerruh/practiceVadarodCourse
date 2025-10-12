package practice.lessons.task3.string;

//10.	Вырезать строку Java c помощью метода String.substring().

public class Task10 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println(cutSubstring("I love Java"));
    }

    static String cutSubstring(String input) {
        int start = input.indexOf("Java");
        if (start == -1) return input;
        int end = start + "Java".length();
        return input.substring(0, start) + input.substring(end);
    }
}
