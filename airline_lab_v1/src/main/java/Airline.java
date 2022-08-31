import data.Flight;
import data.Passenger;

import java.util.ArrayList;
import java.util.HashMap;

public class Airline {

    HashMap<Passenger, Flight> passengerBooking;

    ArrayList<AirportBooking> airportBooking;

//    private ArrayList<AirportBooking> passengerBooking;
//
//    private ArrayList<ArrayList> completeBookingList;

    public Airline() {
//        this.passengerBooking = new ArrayList<>();
//        this.completeBookingList = new ArrayList<>();
        this.passengerBooking = new HashMap<>();
        this.airportBooking = new ArrayList<>();
    }
//
//    public ArrayList<AirportBooking> getPassengerBooking() {
//        return passengerBooking;
//    }
//
//    public void setPassengerBooking(ArrayList<AirportBooking> passengerBooking) {
//        this.passengerBooking = passengerBooking;
//    }
//
//    public ArrayList<ArrayList> getCompleteBookingList() {
//        return completeBookingList;
//    }
//
//    public void setCompleteBookingList(ArrayList<ArrayList> completeBookingList) {
//        this.completeBookingList = completeBookingList;
//    }

    // method to book a passenger onto a flight
//    public void bookPassengerToFlight (AirportBooking name, AirportBooking mobileNumber,
//                                       AirportBooking email, AirportBooking passportNumber,
//                                       AirportBooking nationality, AirportBooking passengerID,
//                                       AirportBooking flightID) {
//        this.passengerBooking.add(name);
//        this.passengerBooking.add(mobileNumber);
//        this.passengerBooking.add(email);
//        this.passengerBooking.add(passportNumber);
//        this.passengerBooking.add(nationality);
//        this.passengerBooking.add(passengerID);
//        this.passengerBooking.add(flightID);
//        this.completeBookingList.add(passengerBooking);
//    }

    public void bookPassengerToFlight(Passenger passenger1, Flight flight1) {
        passengerBooking.put(passenger1, flight1);
    }

//    public void displayBooking(){
//        String booking = passengerBooking.get(passenger1) + passengerBooking.get(flight1);
//        System.out.println(passengerBooking);
//    }
//


}
