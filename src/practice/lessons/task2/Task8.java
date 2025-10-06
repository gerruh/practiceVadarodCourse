package practice.lessons.task2;

//8. Создать массив из чисел. Вывести макс и мин число.

public class Task8 {
    public static void main(String[] args) {
        run();
    }

    static void run() {
        int [] arr = {1,2,3,4,5};

        System.out.println("Первый элемент массива: " + arr[0]);
        System.out.println("Последний элемент массива: " + arr[arr.length-1]);
    }
}
