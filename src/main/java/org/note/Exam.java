package org.note;

import java.time.Instant;
import java.time.LocalDate;

public class Exam {
    private int id;
    private String title;
    private Course course;
    private LocalDate dateExam;
    private int credit;

    public Exam(int id, String title, Course course, LocalDate dateExam, int credit) {
        this.id = id;
        this.title = title;
        this.course = course;
        this.dateExam = dateExam;
        this.credit = credit;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Course getCours() {
        return course;
    }

    public LocalDate getDateExam() {
        return dateExam;
    }

    public int getCredit() {
        return credit;
    }

}
