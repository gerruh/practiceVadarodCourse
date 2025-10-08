package practice.lessons.task2;

import java.util.Arrays;

//9. Создать массив чисел от 1 до 100. Вывести полученный массив.

public class Task9 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        int [] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }

        System.out.println(Arrays.toString(arr));
    }
}
