package generics.universitycourse;
import java.util.List;

class UniversityUtils {

    public static void displayAllCourses(List<? extends CourseType> courseTypes) {
        for (CourseType ct : courseTypes) {
            System.out.println(
                    ct.getType() + " | Evaluation: " + ct.getEvaluationMethod()
            );
        }
    }
}

