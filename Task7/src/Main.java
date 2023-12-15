public class Main {
    public static void main(String[] args) {

        Diploma diploma = new Diploma("Alex"+"\n");



        diploma.addCourse(new Course("Math,",2));
        diploma.addCourse(new Course("English,",4));
        diploma.addCourse(new Course("Physics,",7));

        System.out.println(diploma);

        System.out.println("average grade: "+diploma.average()+"\n");

        Course course = new Course("Math", 7);
        course.setGrade(12);

        System.out.println("Course : "+course.getCourseName() + ", Grade : "+ course.getGrade());

    }
}