package assignment;

public class demo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Earphone earphone = new Earphone();
        Plane plane = new Plane();
        Speaker speaker = new Speaker();
        SuperComputer superComputer = new SuperComputer();
        MilitaryPlane militaryPlane = new MilitaryPlane();
        BookshelfSpeaker bookshelfSpeaker = new BookshelfSpeaker();
        bluetoothEarphone bluetoothEarphone = new bluetoothEarphone();

        speaker.setName("Stereo speaker Z120");
        speaker.setBrand("Logitech");
        speaker.setPrice(170000);
        speaker.getSpeaker();
        System.out.println();

        computer.setComputerName("Asus gaming computer");
        computer.setComputerColor("Black");
        computer.setComputerSpecs("RTX 4090, Intel CPU gen 14, DDR5 RAM x64 gigs");
        computer.setComputerPrice(9999999);
        computer.getComputer();
        System.out.println();


        earphone.setModel("MOONDROP");
        earphone.setColor("Black");
        earphone.setPrice(6000000);
        earphone.setName("MOONDROP Blessing 2 Dusk");
        earphone.getEarphone();
        System.out.println();


        plane.setPlaneName("Airbus");
        plane.setPlaneModel("A380");
        plane.setplaneColor("White");
        plane.getPlane();
        System.out.println();


        superComputer.setComputerName("Frontier");
        superComputer.setComputerColor("Black");
        superComputer.setComputerPrice(999999999);
        superComputer.setComputerSpecs("AMD EPYC 64-core CPUs and AMD Instinct MI250X GPUs");
        superComputer.setPerformance("1,194 petaFLOPS");
        superComputer.getComputer();
        System.out.println();


        militaryPlane.setPlaneName("B-2 Spirit Bomber");
        militaryPlane.setCost("2 Billion dollars per unit");
        militaryPlane.setCapacity("152K Kilograms");
        militaryPlane.setplaneColor("Black");
        militaryPlane.setPlaneModel("Stealth bomber");
        militaryPlane.getPlance();
        System.out.println();


        bookshelfSpeaker.setWatt("200 watt");
        bookshelfSpeaker.setWeight("5,2 KG");
        bookshelfSpeaker.setBrand("KANTO");
        bookshelfSpeaker.setName("Kanto YU6");
        bookshelfSpeaker.setPrice(7500000);
        bookshelfSpeaker.getSpeaker();
        System.out.println();


        bluetoothEarphone.setModel("WF-1000XM5");
        bluetoothEarphone.setColor("Black");
        bluetoothEarphone.setPrice(4000000);
        bluetoothEarphone.setFeature("Active noise cancellation, Wide bluetooth coverage, Water resistant");
        bluetoothEarphone.setName("SONY WF-1000XM5");
        bluetoothEarphone.getEarphone();




    }
}
