import model.UserData;
import model.User;
import infrastructure.UserRepository;

public class FakeUserRepository implements UserRepository {

    @Override
    public void register(User user) {

    }

    @Override
    public boolean login(String username, String password) {
        return false;
    }

    @Override
    public void changePassword(User user) {

    }

    @Override
    public User findUserById(String userId) {
        return null;
    }
}
