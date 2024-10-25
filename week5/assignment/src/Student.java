public class Student {
    private String name;
    private Course course;

    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public String getDetails() {
        return "Student Name: " + name + ", Enrolled in: " + course.getDetails();
    }

    public void enroll(Course course) {
        this.course = course;
        System.out.println(name + " enrolled in " + course.getDetails());
    }
}
