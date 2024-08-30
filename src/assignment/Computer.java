package assignment;

public class Computer {
    private String computerName;
    private int computerPrice;
    private String computerColor;
    private String computerSpecs;

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }
    public void setComputerPrice(int computerPrice) {
        this.computerPrice = computerPrice;
    }
    public void setComputerColor(String computerColor) {
        this.computerColor = computerColor;
    }
    public void setComputerSpecs(String computerSpecs) {
        this.computerSpecs = computerSpecs;
    }

    public void getComputer() {
        System.out.println("Computer Name: " + computerName);
        System.out.println("Computer Price: " + computerPrice);
        System.out.println("Computer Color: " + computerColor);
        System.out.println("Computer Specs: " + computerSpecs);
    }
}
