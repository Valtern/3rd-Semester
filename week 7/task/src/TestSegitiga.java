public class TestSegitiga {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        int totalT = s.totalSudut(20);
        int totalT1 = s.totalSudut(10, 40);
        int totalT2 =s.keliling(5, 10, 8);
        double totalT3 = s.keliling(5, 12);

        System.out.println("Triangle angle : " + totalT);
        System.out.println("Triangle angle 2nd: " + totalT1);
        System.out.println("Circular of a triangle :  " + totalT2);
        System.out.println("Circular of a triangle 2nd: " + totalT3);
    }
}