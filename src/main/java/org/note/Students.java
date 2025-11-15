package org.note;

import java.time.LocalDate;

public class Students extends Person{
    private String group;
    private Tutor tutor;

    public Students(int id, String name, String lastname, LocalDate birthdate, String email, String phone, String group,
                   Tutor tutor) {
        super(id, name, lastname, birthdate, email, phone);
        this.group = group;
        this.tutor = tutor;
    }

    public String getGroup() {
        return group;
    }

    public Tutor getTutor() {
        return tutor;
    }
}
