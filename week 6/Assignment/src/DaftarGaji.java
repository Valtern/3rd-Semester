public class DaftarGaji {
    private Pegawai[] listPegawai;

     DaftarGaji(int indexi) {
         listPegawai = new Pegawai[indexi];
    }
    public void addPegawai(Pegawai pegawai) {
         for (int i = 0; i < listPegawai.length; i++) {
             if (listPegawai[i] == null) {
                 listPegawai[i] = pegawai;
                 break;
             }
         }
    }
    public void printSemuaGaji() {
         for (int i = 0; i < listPegawai.length; i++) {
             System.out.println("Nama: " +listPegawai[i].getNama() + "\n Gaji: " +listPegawai[i].getGaji());
         }
    }
}
