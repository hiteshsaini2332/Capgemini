package generics.universitycourse;

public class ExamCourse extends CourseType {
    public ExamCourse() {
        super("Written Examination");
    }

    @Override
    public String getType() {
        return "Exam-Based";
    }
}
