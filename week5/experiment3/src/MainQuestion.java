public class MainQuestion {
    public static void main(String[] args) {
        Employee machinist = new Employee("1234", "Spongebob Squarepants");
        Railway railway = new Railway("Gaya Baru", "Bisnis", machinist);
        Employee assistant = new Employee("4567", "Patrick Star");




        System.out.println(railway.info());
    }
}
