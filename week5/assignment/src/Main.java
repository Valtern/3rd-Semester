public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics", "MATH101");
        Course scienceCourse = new Course("Science", "SCI201");

        Teacher teacher1 = new Teacher("Mr. Smith", "Mathematics");
        HeadTeacher headTeacher = new HeadTeacher("Mrs. Swan", "Science", "Science Department");

        Student student1 = new Student("Alice", mathCourse);
        Student student2 = new Student("Bob", scienceCourse);

        School school = new School("Polinema", teacher1, headTeacher, student1, student2);

        school.displayDetails();
    }
}