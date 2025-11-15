package org.note;

import java.time.LocalDate;

public class Students extends Person{
    private String group;
    private Tutors tutors;

    public Students(int id, String name, String lastname, LocalDate birthdate, String email, String phone, String group,
                   Tutors tutors) {
        super(id, name, lastname, birthdate, email, phone);
        this.group = group;
        this.tutors = tutors;
    }

    public String getGroup() {
        return group;
    }

    public Tutors getTutor() {
        return tutors;
    }
}
