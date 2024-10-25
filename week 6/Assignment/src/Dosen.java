public class Dosen extends Pegawai {
    public int jumlahSKS, TARIF_SKS = 20000;

    Dosen (String idk, String idk1, String idk2) {
        super(idk, idk1, idk2);
    }

    public void setSKS (int SKS) {
        this.jumlahSKS = SKS;
    }
    @Override
    public int getGaji () {
        return jumlahSKS * TARIF_SKS;
    }

}
