package practice.lessons.task5;

public interface Electrodevice {
    void work();
    default void start() {
        System.out.println("Электроприбор стартует");
    }
}
