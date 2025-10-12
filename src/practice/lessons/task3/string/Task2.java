package practice.lessons.task3.string;

//2.	Распечатать последний символ строки. Используем метод String.charAt().

public class Task2 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        String str1 = "abc";
        System.out.println(str1.charAt(str1.length()-1));
    }
}
