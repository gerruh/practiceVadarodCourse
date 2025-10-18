package practice.lessons.task4;

/*
1.3 Создать класс Промышленном здание (IndustrialBuilding). Промышленные здания наследуются от Постройки. Поля которые можно определить в Промышленном здании: отрасль (Отрасль в которой здание задействовано (машиностроительная, легкая промышленность, целлюлозная промышленность, сельское хозяйство)
 */

public class IndustrialBuilding extends Building {

    private String sector;

    public IndustrialBuilding(
            String street,
            String wallMaterial,
            int yearOfBuilding,
            String sector
    ) {
        super(street, wallMaterial, yearOfBuilding);
        this.sector = sector;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("IndustrialBuilding{");
        sb.append("super=").append(super.toString());
        sb.append(", sector='").append(sector).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
