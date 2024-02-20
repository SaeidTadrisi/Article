package model;

import java.time.LocalDate;

import static java.lang.String.*;

    public record UserData(String username, String nationalCode, LocalDate birthday) {
}
