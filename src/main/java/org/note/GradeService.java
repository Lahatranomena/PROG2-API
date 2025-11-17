package org.note;

import java.time.Instant;
import java.util.List;

public class GradeService {
    public double getExamGrade(Exam exam, Students student, Instant t, List<Grade> allGrades) {
        for (Grade g : allGrades) {
            if (g.getExam().equals(exam) && g.getStudent().equals(student)) {
                return g.getValueAt(t);
            }
        }
        return 0;
    }

    public double getCourseGrade(Course course, Students student, Instant t, List<Grade> allGrades, List<Exam> allExams) {
        double totalWeighted = 0;
        double totalCoef = 0;

        for (Exam exam : allExams) {
            if (exam.getCourse().equals(course)) {
                double note = getExamGrade(exam, student, t, allGrades);
                totalWeighted += note * exam.getCredit();
                totalCoef += exam.getCredit();
            }
        }

        if (totalCoef == 0) throw new IllegalStateException("No exam founds for this course");

        return totalWeighted / totalCoef;
    }

}
