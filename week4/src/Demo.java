public class Demo {
    public static void main(String[] args) {
        Member member1 = new Member("Ika ", "BatuC");
        System.out.println("Deposit " + member1.getName() + " Rp. " + member1.getDeposit());
        member1.setName("Iwan");
        member1.setAddress("Malang");
        member1.deposit(1000000f);
        System.out.println("Deposito " + member1.getName() + " Rp. " + member1.getDeposit());

        member1.loan(500000f);
        System.out.println("Deposito " + member1.getName() + " Rp. " + member1.getDeposit());
    }
}
