import java.util.ArrayList;

public class Diploma {

    String studentName;
    ArrayList<Course> courses = new ArrayList<>();

    Diploma(String studentName) {
        this.studentName = studentName;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public double average() {
        if (courses.isEmpty()) {
            return 0.0;
        }

        int totalGrades = 0;
        for (Course course : courses) {
            totalGrades += course.getGrade();
        }

        return (double) totalGrades / courses.size();
    }



    public String toString() {
        StringBuilder result = new StringBuilder("Name: " + studentName + "\n");

        for (Course course : courses) {

            result.append("Course: ").append(course.getCourseName()).append(" Grade: ").append(course.getGrade()).append("\n");
        }

        return result.toString();

    }
}
