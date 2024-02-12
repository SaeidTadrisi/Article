package model;

public class UserDTO {

    private final String id;
    private final User user;

    public UserDTO(String id, User user) {
        this.id = id;
        this.user = user;
    }
}
