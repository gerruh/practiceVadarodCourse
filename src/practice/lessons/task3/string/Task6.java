package practice.lessons.task3.string;

//6.	Найти позицию подстроки “Java” в строке “I like Java!!!”.

public class Task6 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println(substringPosition("I love Java", "Java"));
    }

    static int substringPosition(String input, String findable) {
        return input.indexOf(findable);
    }
}
