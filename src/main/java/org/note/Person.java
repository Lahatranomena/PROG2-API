package org.note;

import java.time.LocalDate;

public class Person {
    protected int id;
    protected String name;
    protected String lastname;
    protected LocalDate birthdate;
    protected String email;
    protected String phone;

    public Person(int id, String name, String lastname, LocalDate birthdate, String email, String phone) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getLastname() {
        return lastname;
    }
    public LocalDate getBirthdate() {
        return birthdate;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }


}
