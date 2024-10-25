public class Barang {
    String kode, namaBarang;
    int hargaDasar;
    float diskon;

    public int hitungHargaJual() {
        return (int) (hargaDasar - (diskon * hargaDasar));
    }

    public void tampilData() {
        System.out.println("Nama barang: " + namaBarang);
        System.out.println("Kode barang: " + kode);
        System.out.println("Harga dasar: " + hargaDasar);
        System.out.println("Diskon: " + diskon);
        System.out.println("Harga jual: " + hitungHargaJual());
    }
}
