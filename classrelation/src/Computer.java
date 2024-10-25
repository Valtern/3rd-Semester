public class Computer {
    private String brand;
    private Processor proc;

    Computer(String brand, Processor proc) {
        this.brand = brand;
        this.proc = proc;
    }

    Computer() {

    }

    public void info() {
        System.out.println("Computer brandBrand: " + brand);
        proc.print();
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setProcessor(Processor proc) {
        this.proc = proc;
    }
}
