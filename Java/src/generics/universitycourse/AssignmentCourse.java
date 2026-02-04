package generics.universitycourse;

public class AssignmentCourse extends CourseType{
    public AssignmentCourse() {
        super("Assignments & Projects");
    }

    @Override
    public String getType() {
        return "Assignment-Based";
    }
}
