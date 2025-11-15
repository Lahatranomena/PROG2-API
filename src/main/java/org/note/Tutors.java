package org.note;

import java.time.LocalDate;

public class Tutors extends Person {
    String description;

    public Tutors(int id, String name, String lastname, LocalDate birthdate, String email, String phone, String description) {
        super(id, name, lastname, birthdate, email, phone);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
