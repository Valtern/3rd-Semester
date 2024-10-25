public class Employee {
    private String name;
    private String identityNumber;

    Employee(String identityNumber, String name) {
        this.name = name;
        this.identityNumber = identityNumber;
    }
    public String getName() {
        return name;
    }
    public String getIdentityNumber() {
        return identityNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String info() {
        String info = "";
        info += "Identity Number: " + this.identityNumber + "\n";
        info += "Name: " + this.name + "\n";
        return info;
    }
}
