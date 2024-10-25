public class testLingkaran {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 10;
        System.out.println("Area of the circle = " + lingkaran.hitungLuas());
        System.out.println("Circumference of the circle " + lingkaran.hitungKeliling());
    }
}
