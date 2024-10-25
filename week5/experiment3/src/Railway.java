public class Railway {
    private String name;
    private String railwayClass;
    private Employee machinist;
    private Employee assistant;

    Railway(String name, String railwayClass, Employee machinist) {
        this.name = name;
        this.railwayClass = railwayClass;
        this.machinist = machinist;
    }
    Railway(String name, String railwayClass, Employee machinist, Employee assistant) {
        this.name = name;
        this.railwayClass = railwayClass;
        this.machinist = machinist;
        this.assistant = assistant;
    }
    public String getName() {
        return name;
    }
    public String getRailwayClass() {
        return railwayClass;
    }
    public Employee getMachinist() {
        return machinist;
    }
    public Employee getAssistant() {
        return assistant;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRailwayClass(String railwayClass) {
        this.railwayClass = railwayClass;
    }
    public void setMachinist(Employee machinist) {
        this.machinist = machinist;
    }
    public void setAssistant(Employee assistant) {
        this.assistant = assistant;
    }

    public String info() {
        String info = "";
        info += "Name: " + name + "\n";
        info += "Railway Class: " + railwayClass + "\n";
        if (machinist != null) {
            info += "Machinist: " + machinist.info() + "\n";
        } else {
            info += "Machinist is empty\n";
        }
        if (assistant != null) {
            info += "Assistant: " + assistant.info() + "\n";
        } else {
            info += "Assistant is empty\n";
        }
        return info;
    }
}
