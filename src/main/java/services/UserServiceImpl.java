package services;

import infrastructure.UserRepository;
import model.RandomId;
import model.User;
import model.UserData;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void userRegister(UserData userData) {
        User user = new User(new RandomId().userIdGenerator(), userData, userData.nationalCode());
        userRepository.register(user);
    }

    @Override
    public boolean userLogin(String username, String password) {
        return userRepository.login(username, password);
    }

    @Override
    public void changePassword(String userId, String newPassword) {
        User userById = userRepository.findUserById(userId);
        userRepository.changePassword(new User(userId, userById.user(), newPassword));
    }
}
