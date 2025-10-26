package practice.lessons.task5;

/*
1. Создать класс Персонаж. Поля Имя, фамилия.
2. Создать класс Студент. Поля факультет
3. Создать класс Сотрудник. Поля, зарплата
4. Создать класс Отдел. Имя id отдела. Отдела.
5. Создать класс стол. Этот класс будет состоять из двух дженериков. Первый дженерик будет отображать инвертарный номер стола(Integer), второй дженерик будет отображать персонажа, который за ним будет сидеть
6. Реализовать метод в классе стол, который будет выводить имя персонажа, который сидит за столом.
7. В классе main Создать три стола, за которыми будут сидеть студент и сотрудник.
8. Вывести поочередно  имена персонажей, которые сидят за столом.
 */

public class Table<T1 extends Integer,T2 extends Character> {
    private T1 inventoryNumber;
    private T2 characterAtTable;

    public void printCharacter() {
        System.out.println(characterAtTable.getName());
    }

    public T2 getCharacterAtTable() {
        return characterAtTable;
    }

    public void setCharacterAtTable(T2 characterAtTable) {
        this.characterAtTable = characterAtTable;
    }

    public Table() {};

    public Table(T1 inventoryNumber, T2 characterAtTable) {
        this.inventoryNumber = inventoryNumber;
        this.characterAtTable = characterAtTable;
    }
}
