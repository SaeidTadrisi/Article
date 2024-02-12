package model;

import java.time.LocalDate;

import static java.lang.String.*;

public class User {
    private final String username;
    private final int nationalCode;
    private final LocalDate birthday;
    private final String password;

    public User(String username, int nationalCode, LocalDate birthday) {
        this.username = username;
        this.nationalCode = nationalCode;
        this.birthday = birthday;
        this.password = valueOf(nationalCode);
    }
}
