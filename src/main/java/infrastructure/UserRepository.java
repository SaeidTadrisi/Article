package infrastructure;

import model.UserData;
import model.User;

public interface UserRepository {

    void register(User user);

    boolean login(String username, String password);

    void changePassword(User user);

    User findUserById(String userId);
}
