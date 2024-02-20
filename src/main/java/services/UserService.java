package services;

import model.User;
import model.UserData;

public interface UserService {

    void userRegister(UserData userData);

    boolean userLogin(String username, String password);

    void changePassword(String username, String password);
}
