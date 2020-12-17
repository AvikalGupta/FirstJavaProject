package Avikal.ConceptsPractice;

import java.util.ArrayList;
import java.util.List;

public class Theatre {

    private String theatreName;
    private List<Seat> seats = new ArrayList<>();
    private int seatsPerRow;
    private int totalBookedSeats = 0;
    private int availableseats;

    public Theatre(String theatreName, int numOfRows, int seatsPerRow) {
        this.theatreName = theatreName;
        int lastRow = 'A' + seatsPerRow - 1;
        this.seatsPerRow = seatsPerRow;
        this.availableseats = seatsPerRow * numOfRows;
        for(char row = 'A'; row<=lastRow; row++) {
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d",seatNum));
                seats.add(seat);
            }
        }
    }

    public void getSeats() {
        int count = 1;
        System.out.println("*******************************");
        for(Seat seat: seats) {
            if(seat.isReserved()) {
                System.out.print("_*_  ");
            } else {
                System.out.print(seat.getSeatNumber() + "  ");
            }

            if(count == this.seatsPerRow) {
                System.out.println("");
                count = 1;
                continue;
            }
            count++;
        }
        System.out.println("*******************************");
        System.out.println("Booked -> " + this.totalBookedSeats
                            + "\n" + "Available -> " + this.availableseats) ;
        System.out.println("*******************************");

    }

    protected boolean reserveSeat(String seatNumber) {
//        Seat requestedSeat = new Seat(seatNumber);
//        int foundSeat = Collections.binarySearch(seats, seatNumber, null);
//        if(foundSeat > 0) {
//            return seats.get(foundSeat).reserve();
//        } else {
//            System.out.println("Seat " + seatNumber + " is not found");
//            return false;
//        }
//        for(Seat seat: seats) {
//            System.out.print(".");
//            if(seat.getSeatNumber().equals(seatNumber)) {
//                requestedSeat = seat;
//                break;
//            }

        int low = 0;
        int high = seats.size()-1;

        while(low <= high) {
            System.out.print(".");
            int mid = (low + high) / 2;
            Seat midVal = seats.get(mid);
            int cmp = midVal.getSeatNumber().compareToIgnoreCase(seatNumber);

            if(cmp < 0) {
                low = mid + 1;;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                this.availableseats--;
                this.totalBookedSeats++;
                return seats.get(mid).reserve();
            }
        }

        System.out.println("There is no " + seatNumber + " in the " + this.theatreName + " theatre.");
        return false;
//        requestedSeat.reserve();
//        this.availableseats--;
//        this.totalBookedSeats++;
//        return true;
    }

    protected boolean cancleSeat(String seatNumber) {
//        Seat requestedSeat = null;
        for(Seat seat : seats) {
            if(seat.getSeatNumber().equals(seatNumber)) {
                seat.cancleSeat();
                this.availableseats++;
                this.totalBookedSeats--;
//                requestedSeat = seat;
                return true;
            }
        }
        System.out.println("There is no " + seatNumber + " in the " + this.theatreName + " theatre.");
        return false;
    }

    public static class Seat implements Comparable<Seat>{
        private String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {

            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        protected boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + this.seatNumber + " is reserved.");
                return true;
            } else {
               return false;
            }
        }

        protected boolean isReserved() {
            if(!this.reserved) {
                return false;
            } else {
                return true;
            }
        }

        protected boolean cancleSeat() {
            if(this.reserved) {
                this.reserved = false;
                System.out.println("Seat " + this.seatNumber + " booking is cancelled.");
                return true;
            } else {
                System.out.println("This seat " + this.seatNumber + "is not booked yet.");
                return false;
            }
        }
    }
}
