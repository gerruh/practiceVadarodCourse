package practice.lessons.task3.string;

//4.	Проверить, начинается ли ваша строка подстрокой “Добро пож”. Используем метод String.startsWith().

public class Task4 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println(isItStartedWith("Недобро пожаловать", "Добро пож"));
    }

    static boolean isItStartedWith(String inputText, String containedText) {
        return inputText.startsWith(containedText);
    }
}
