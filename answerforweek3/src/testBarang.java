public class testBarang {
    public static void main(String[] args) {
        Barang barang = new Barang();
        barang.hargaDasar = 25000;
        barang.namaBarang = "Sabun mandi premium";
        barang.kode = "001";
        barang.diskon = 0.1f;

        barang.tampilData();



    }
}