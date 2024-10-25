public class HeadTeacher extends Teacher {
    private String department;

    public HeadTeacher(String name, String subject, String department) {
        super(name, subject);
        this.department = department;
    }

    @Override
    public String getDetails() {
        return "HeadTeacher Name: " + name + ", Subject: " + subject + ", Department: " + department;
    }

    public void manage() {
        System.out.println(name + " is managing the " + department + " department.");
    }
}
