public class Course {
    private String courseName;
    private String courseCode;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public String getDetails() {
        return "Course: " + courseName + " (" + courseCode + ")";
    }
}
