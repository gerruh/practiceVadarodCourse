package practice.lessons.task7;

import practice.lessons.task7.exception.NotCorrectPasswordException;
import practice.lessons.task7.exception.UserNotFoundException;
import practice.lessons.task7.service.UserService;

import java.util.HashMap;
import java.util.Map;

public class Task10 {
    public static void main(String[] args) {
        authenticating();
    }

    /*Задача 2
1. Создать класс пользователь. Поля логин, пароль, имя, фамилия.
2. Создать класс UserRepository. Внутри класса создать статическую переменную List<User>
 users.
3. Выполнить инициаизацию коллекции в статическом блоке. Создать 5 пользователей и
заполнить поля.
4. Создать класс сервис. Реализовать в этом классе метод аутенфикации  пользователя
(void authenticate (String login, String password). Этот метод должен проверять наличие
пользователя в репозитории по логину. Если пользователя нет, то выбрасываем собственное
 исключение (UserNotFoundException)
5. В этом же методе выполнить проверку пароля пользователя, если по логину мы его нашли.
 Если пароль не совпадает, то выбрасываем собственное исключение
  NotCorrectPasswordException.
6. В классе main при вызове метода аутенфикации перехватите исключение
UserNotFoundException и выведите в консоль (нет пользователя)
7. Также перехватите оставшиеся исключения и в блоке catch выведите в консоль сообщение
(Вы не прошли аутенфикацию)*/
    public static void authenticating() {
        try {
            UserService userService = new UserService();
            userService.authenticate("Masha1", "ywdcd");
        } catch (NotCorrectPasswordException notCorrectPasswordException) {
            System.out.println("Вы не прошли аутенфикацию");
        } catch (UserNotFoundException userNotFoundException) {
            System.out.println(userNotFoundException.getMessage());
        }
    }
}