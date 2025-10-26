package practice.lessons.task5;
import java.util.ArrayList;
import java.util.List;


public class Exhibition<T> {
    private List<T> list = new ArrayList<>();

    public void setElementToArray(T element) {
        list.add(element);
    }

    public List<T> getList() {
        return list;
    }

    // Для обратной совместимости
    public T[] getArray() {
        return (T[]) list.toArray();
    }
}