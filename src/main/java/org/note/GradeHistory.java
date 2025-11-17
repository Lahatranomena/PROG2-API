package org.note;

import java.time.Instant;

public class GradeHistory {
    private double oldValue;
    private double newValue;
    private Instant changeAt;
    private String reason;
    private String comment;

    public GradeHistory(double oldValue, double newValue, Instant changeAt, String reason, String comment) {
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.changeAt = changeAt;
        this.reason = reason;
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public String getReason() {
        return reason;
    }

    public Instant getChangeAt() {
        return changeAt;
    }

    public double getNewValue() {
        return newValue;
    }

    public double getOldValue() {
        return oldValue;
    }

    public Instant getTimestamp() {
        return changeAt;
    }
}
