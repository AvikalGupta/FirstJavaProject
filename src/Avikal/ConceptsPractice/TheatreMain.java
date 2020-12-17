package Avikal.ConceptsPractice;

public class TheatreMain {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("IP Vijya", 8, 8);
//        List<> seatCopy = new ArrayList<>();
        Theatre pvr = new Theatre("PVR Varanasi", 5, 5);
        pvr.getSeats();
//        System.out.println("Hello");
        pvr.reserveSeat("B01");
        pvr.reserveSeat("C02");
        pvr.reserveSeat("A05");
        pvr.reserveSeat("E06");
        pvr.reserveSeat("A01");
        pvr.reserveSeat("A02");
        pvr.reserveSeat("A03");
        pvr.reserveSeat("C03");
        pvr.reserveSeat("B05");
        pvr.reserveSeat("E05");
        pvr.getSeats();
        pvr.cancleSeat("A06");
        pvr.cancleSeat("A01");
        pvr.cancleSeat("C03");
        pvr.getSeats();

    }
}
