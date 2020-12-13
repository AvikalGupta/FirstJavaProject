package Avikal.JavaMasterClass;

public class TheatreMain {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("PVR Varanasi", 10,4);
        theatre.getSeats();
        if(theatre.reserveSeat("H02")) {
            System.out.println("Please Pay");
        } else {
            System.out.println("Sorry!!!! Seat is already taked.");
        }
        if(theatre.reserveSeat("H2")) {
            System.out.println("Please Pay");
        } else {
            System.out.println("Sorry!!!! Seat is already taked.");
        }
    }
}
