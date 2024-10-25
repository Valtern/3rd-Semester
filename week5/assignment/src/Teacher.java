public class Teacher {
    protected String name;
    protected String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getDetails() {
        return "Teacher Name: " + name + ", Subject: " + subject;
    }

    public void teach() {
        System.out.println(name + " is teaching " + subject);
    }
}
