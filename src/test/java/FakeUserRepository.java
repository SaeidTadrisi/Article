import model.User;
import model.UserDTO;
import infrastructure.UserRepository;

public class FakeUserRepository implements UserRepository {

    @Override
    public void register(User user) {
    }

    @Override
    public UserDTO login(String username, String password) {
        return null;
    }

    @Override
    public void changePassword(String newPassword) {
    }
}
