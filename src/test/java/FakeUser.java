import model.User;
import model.UserDTO;

import java.time.LocalDate;

public class FakeUser {

    public UserDTO getUser(){
        User sam = new User("Sam", 25124552, LocalDate.of(1991, 3, 25));
        return new UserDTO("12541254", sam);
    }
}
