package practice.lessons.task7.service;

import practice.lessons.task7.entity.User;
import practice.lessons.task7.exception.NotCorrectPasswordException;
import practice.lessons.task7.repository.UserRepository;

public class UserService {
    public User authenticate (String login, String password) {
        UserRepository userRepository = new UserRepository();
        User user = userRepository.searchUserByLogin(login);
        if (user.getPassword().equals(password)) {
           return user;
        }
        throw new NotCorrectPasswordException("Пароль не совпадает!");
    }
}
