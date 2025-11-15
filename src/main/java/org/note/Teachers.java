package org.note;

import java.time.LocalDate;

public class Teachers extends Person {
    private String specialty;

    public Teachers(int id, String name, String lastname, LocalDate birthdate, String email, String phone,
                   String specialty) {
        super(id, name, lastname, birthdate, email, phone);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }
}
