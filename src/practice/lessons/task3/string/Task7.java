package practice.lessons.task3.string;

//7.	Заменить все символы “а” на “о”.

public class Task7 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println(getChanged("Карамба"));
    }

    static String getChanged(String input) {
        return input.replace("a", "o");
    }
}
