public class Passenger {
    private String name;
    private String identityCard;

    Passenger(String identityCard, String name) {
        this.name = name;
        this.identityCard = identityCard;
    }
    Passenger() {

    }
    public String getName() {
        return name;
    }
    public String getIdentityCard() {
        return identityCard;
    }
    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String info(){
        String info = "";
        info += "Identity Card: " + identityCard + "\n";
        info += "Name: " + name + "\n";
        return info;
    }
}
