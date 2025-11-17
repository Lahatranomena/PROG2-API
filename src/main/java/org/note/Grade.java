package org.note;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Grade {
    private Students student;
    private Exam exam;
    private double currentValue;
    private Instant createdAt;
    private List<GradeHistory> history = new ArrayList<>();

    public Grade(Students student, Exam exam, double currentValue, Instant createdAt) {
        this.student = student;
        this.exam = exam;
        this.currentValue = currentValue;
        this.createdAt = createdAt;
    }

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


    public void addHistory(GradeHistory history) {
        this.history.add(history);
    }
    public List<GradeHistory> getHistory() {
        return history;
    }


    public double getValueAt(Instant t) {
        double currentValue = getCurrentValue();
        for (GradeHistory h : history) {
            if (!h.getTimestamp().isAfter(t)) {
                currentValue = h.getNewValue();
            }
        }
        return currentValue;
    }
}
