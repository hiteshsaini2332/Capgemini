package generics.universitycourse;

import java.util.ArrayList;
import java.util.List;

public class Test {
    static void main() {
        Course<ExamCourse> cs101 =
                new Course<>("CS101", "Computer Science", new ExamCourse());

        Course<AssignmentCourse> cs205 =
                new Course<>("CS205", "Computer Science", new AssignmentCourse());

        Course<ResearchCourse> phd900 =
                new Course<>("PHD900", "Research", new ResearchCourse());

        cs101.displayCourse();
        cs205.displayCourse();
        phd900.displayCourse();

        // Wildcard example
        List<CourseType> courseTypes = new ArrayList<>();
        courseTypes.add(new ExamCourse());
        courseTypes.add(new AssignmentCourse());
        courseTypes.add(new ResearchCourse());

        System.out.println("\nAll Course Evaluation Types:");
        UniversityUtils.displayAllCourses(courseTypes);
    }
}
