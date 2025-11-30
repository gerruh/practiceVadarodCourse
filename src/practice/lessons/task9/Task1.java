package practice.lessons.task9;

/*
1. Создать функциональный интерфейс. В этом интерфейсе будет метод, который будет возвращать результат умножения двух чисел.
Наименование метода: Integer multiplication(int a, int b);
2. В классе main используя ваш функциональный интерфейс, создате лямбда выражение и посчитайте произведение 5 на 10.
3. Результат выведите в консоль.
 */

public class Task1 {
    public static void main(String[] args) {
        Multi multi = (int a, int b) -> {
            return a * b;
        };

        int m = multi.multiplication(5,10);
        System.out.println(m);

        Multi divide = (int a, int b) -> {
            return a / b;
        };

        int md = divide.multiplication(10,5);
        System.out.println(md);

        Multi add = (int a, int b) -> {
            return a + b;
        };

        int ma = add.multiplication(10,5);
        System.out.println(ma);
    }
}
