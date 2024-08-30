package assignment;

public class bluetoothEarphone extends Earphone{
    private String feature;

    public void setFeature(String feature) {
        this.feature = feature;
    }
    public void getEarphone () {
        super.getEarphone();
        System.out.println("Feature: " + feature);
    }
}
