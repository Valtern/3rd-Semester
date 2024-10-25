import java.util.Scanner;

public class OOPcourse extends course{
    Scanner sc = new Scanner(System.in);
    course det = new course();

    public String setCoursename() {
        System.out.println("Enter course name");
        return super.CourseName(sc.nextLine());

    }

    public String setLecturername() {
        System.out.println("Enter lecturer name");
        return super.setLecturerName(sc.nextLine());
    }

    public double setCoursegrade() {
        double[] temp = new double[4];
        System.out.println("Enter grade (QUIZ 1, UTS, QUIZ 2, UAS): ");
        for (int i = 0; i < temp.length; i++) {
            temp[i] = sc.nextDouble();
        }
        return super.respectiveGrade(temp);
    }

    public String setStudentname() {
        System.out.println("Enter student name");
        return super.setStudentName(sc.nextLine());
    }


}
