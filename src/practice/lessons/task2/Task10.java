package practice.lessons.task2;

import java.util.Arrays;

//10. Сортировать массив чисел. Сортирвка пузырьком

public class Task10 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        int [] arr = {3,2,5,1,4};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}