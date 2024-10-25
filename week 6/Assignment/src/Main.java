import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args)  {
        DaftarGaji gaji = new DaftarGaji(2);
        Dosen dosen = new Dosen("12345", "Harry", "JL. sukarno");
        Dosen dosen1 = new Dosen("56789", "Garry", "JL. bromo");
        dosen.setSKS(12);
        gaji.addPegawai(dosen);
        dosen1.setSKS(20);
        gaji.addPegawai(dosen1);
        gaji.printSemuaGaji();
    }
}