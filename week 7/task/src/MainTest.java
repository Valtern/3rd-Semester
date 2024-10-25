public class MainTest {
    public static void main(String[] args) {
        Dosen dsn = new Dosen();
        Mahasiswa mhs = new Mahasiswa();
        Manusia man = new Manusia();
        Manusia ref;
        ref = man;
        ref.makan();
        man.bernafas();
        ref = dsn;
        ref.makan();
        dsn.lembur();
        ref = mhs;
        ref.makan();
        mhs.tidur();





    }

}
