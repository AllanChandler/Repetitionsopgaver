public class Course {

    String courseName;
    int grade;

    Course(String courseName, int grade) {
        this.courseName = courseName;
        this.grade = grade;

    }

    public String getCourseName() {
        return courseName;
    }

    public int getGrade() {
        return grade;
    }

    private int isValidGrade(int grade) {
        int[] validGrades = {-3, 0, 2, 4, 7, 10, 12};
        for (int validGrade : validGrades) {
            if (validGrade == grade) {
                return grade;
            }
        }
        return -10000;
    }

    public void setGrade(int grade) {
        this.grade = isValidGrade(grade);
    }


    public String toString() {

        return courseName + " : " + grade;

    }


}
