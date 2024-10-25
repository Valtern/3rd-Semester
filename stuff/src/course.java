public class course {
    double totalGrade;
    String courseName;
    double[] respectiveGrade = new double[4];
    String lecturerName;
    String studentName;


    public String setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
        return lecturerName;
    }

    public String setStudentName(String studentName) {
        this.studentName = studentName;
        return studentName;
    }

    public String CourseName(String courseName) {
        this.courseName = courseName;
        return courseName;
    }

    public double respectiveGrade(double[] respectiveGrade) {
        double temp = 0;
        this.respectiveGrade = respectiveGrade;
        for (int i = 0; i < respectiveGrade.length; i++) {
            temp += respectiveGrade[i];
        }
        totalGrade = temp / 4;
        return totalGrade;
    }

}
