package infrastructure;

import model.User;
import model.UserDTO;

public interface UserRepository {

    void register(User user);

    UserDTO login(java.lang.String username, java.lang.String password);

    void changePassword(java.lang.String newPassword);
}
