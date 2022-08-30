import java.util.ArrayList;

public class Airline {

    private ArrayList<AirportBooking> passengerBooking;

    private ArrayList<ArrayList> completeBookingList;

    public Airline() {
        this.passengerBooking = new ArrayList<>();
        this.completeBookingList = new ArrayList<>();
    }

    public ArrayList<AirportBooking> getPassengerBooking() {
        return passengerBooking;
    }

    public void setPassengerBooking(ArrayList<AirportBooking> passengerBooking) {
        this.passengerBooking = passengerBooking;
    }

    public ArrayList<ArrayList> getCompleteBookingList() {
        return completeBookingList;
    }

    public void setCompleteBookingList(ArrayList<ArrayList> completeBookingList) {
        this.completeBookingList = completeBookingList;
    }

    // method to book a passenger onto a flight
    public void bookPassengerToFlight (AirportBooking name, AirportBooking mobileNumber,
                                       AirportBooking email, AirportBooking passportNumber,
                                       AirportBooking nationality, AirportBooking passengerID,
                                       AirportBooking flightID) {
        this.passengerBooking.add(name);
        this.passengerBooking.add(mobileNumber);
        this.passengerBooking.add(email);
        this.passengerBooking.add(passportNumber);
        this.passengerBooking.add(nationality);
        this.passengerBooking.add(passengerID);
        this.passengerBooking.add(flightID);
        this.completeBookingList.add(passengerBooking);
    }

}
