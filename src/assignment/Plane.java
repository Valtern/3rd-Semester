package assignment;

public class Plane {
    private String planeName;
    private String planeModel;
    private String planeColor;

    public void setPlaneName (String planeName) {
        this.planeName = planeName;
    }
    public void setPlaneModel (String planeModel) {
        this.planeModel = planeModel;
    }
    public void setplaneColor (String planeColor) {
        this.planeColor = planeColor;
    }

    public void getPlane () {
        System.out.println("Plane name: " + planeName);
        System.out.println("Plane type: " + planeModel);
        System.out.println("Plane color: " + planeColor);
    }
}
