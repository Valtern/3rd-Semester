package assignment;

public class BookshelfSpeaker extends Speaker{
    private String weight;
    private String watt;

    public void setWeight (String weight) {
        this.weight = weight;
    }
    public void setWatt (String watt) {
        this.watt = watt;
    }
    public void getSpeaker() {
        super.getSpeaker();
        System.out.println("Weight : " + weight);
        System.out.println("Watt : " + watt);
    }
}
