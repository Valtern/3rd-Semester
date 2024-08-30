package assignment;

public class SuperComputer extends Computer{
    private String performance;

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public void getComputer () {
        super.getComputer();
        System.out.println("Performance: " + performance);

    }
}
