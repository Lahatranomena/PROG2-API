package org.note;

public class Course {
    private int id;
    private String label;
    private int credits;
    Teachers teachers;

    public Course(int id, String label, int credits, Teachers teachers) {
        this.id = id;
        this.label = label;
        this.credits = credits;
        this.teachers = teachers;
    }

    public int getId() {
        return id;
    }
    public String getLabel() {
        return label;
    }
    public int getCredits() {
        return credits;
    }
    public Teachers getTeacher() {
        return teachers;
    }
}
