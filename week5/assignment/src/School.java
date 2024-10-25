public class School {
    private String name;
    private Teacher teacher1;
    private Teacher teacher2;
    private Student student1;
    private Student student2;

    public School(String name, Teacher teacher1, Teacher teacher2, Student student1, Student student2) {
        this.name = name;
        this.teacher1 = teacher1;
        this.teacher2 = teacher2;
        this.student1 = student1;
        this.student2 = student2;
    }

    public void displayDetails() {
        System.out.println("School Name: " + name);
        System.out.println("Teachers:");
        System.out.println(teacher1.getDetails());
        System.out.println(teacher2.getDetails());
        System.out.println("Students:");
        System.out.println(student1.getDetails());
        System.out.println(student2.getDetails());
    }
}
