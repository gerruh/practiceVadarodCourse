package practice.lessons.task8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Farm implements Externalizable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String location;
    private int animalCount;
    private double area;
    private List<String> animalTypes;

    public Farm() {
        this.animalTypes = new ArrayList<>();
    }

    public Farm(String name, String location, int animalCount, double area, List<String> animalTypes) {
        this.name = name;
        this.location = location;
        this.animalCount = animalCount;
        this.area = area;
        this.animalTypes = animalTypes != null ? new ArrayList<>(animalTypes) : new ArrayList<>();
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        out.writeUTF(location);
        out.writeInt(animalCount);
        out.writeDouble(area);

        out.writeInt(animalTypes.size());
        for (String type : animalTypes) {
            out.writeUTF(type);
        }

        System.out.println("Сериализована ферма: " + name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        location = in.readUTF();
        animalCount = in.readInt();
        area = in.readDouble();

        int typesCount = in.readInt();
        animalTypes = new ArrayList<>();
        for (int i = 0; i < typesCount; i++) {
            animalTypes.add(in.readUTF());
        }

        System.out.println("Десериализована ферма: " + name);
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public int getAnimalCount() { return animalCount; }
    public void setAnimalCount(int animalCount) { this.animalCount = animalCount; }

    public double getArea() { return area; }
    public void setArea(double area) { this.area = area; }

    public List<String> getAnimalTypes() { return animalTypes; }
    public void setAnimalTypes(List<String> animalTypes) {
        this.animalTypes = new ArrayList<>(animalTypes);
    }

    @Override
    public String toString() {
        return String.format("Ферма '%s' [Местоположение: %s, Животных: %d, Площадь: %.2f га, Типы: %s]",
                name, location, animalCount, area, animalTypes);
    }
}
