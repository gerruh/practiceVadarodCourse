package practice.lessons.task5;

public class Coffeemachine implements Electrodevice {
    private String name;
    private String[] functionalityList;
    private boolean isOn = false;

    @Override
    public void work() {
        System.out.println("Кофемашина варит кофе");
    }

    @Override
    public void start() {

        isOn = isOn == true ? true : false;

        System.out.println("Состояние кофемашины сейчас: " + isOn);
    }

    public Coffeemachine(String name, String[] functionalityList) {
        this.name = name;
        this.functionalityList = functionalityList;
    }
}
