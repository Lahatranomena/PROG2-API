package org.note;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Grade {
    private Students student;
    private Exam exam;
    private double currentValue;
    private Instant createdAt;
    private List<GradeHistory> Historics = new ArrayList<>();


    public Students getStudent() {
        return student;
    }

    public Exam getExam() {
        return exam;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Grade(Students student, Exam exam, double currentValue, Instant createdAt) {
        this.student = student;
        this.exam = exam;
        this.currentValue = currentValue;
        this.createdAt = createdAt;
    }

    public void addHistoric(GradeHistory historic) {
        Historics.add(historic);
    }
    public List<GradeHistory> getHistorics() {
        return Historics;
    }
}
