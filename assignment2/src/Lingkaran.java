public class Lingkaran {
    double phi = 3.14, r;

    public double hitungLuas() {
        return phi * Math.pow(r, 2);
    }

    public double hitungKeliling() {
        return 2 * phi * r;
    }
}
