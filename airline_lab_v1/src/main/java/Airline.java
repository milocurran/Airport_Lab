import data.Flight;
import data.Passenger;

import java.util.ArrayList;
import java.util.HashMap;

public class Airline {

    HashMap<Passenger, Flight> passengerBooking;

    ArrayList<AirportBooking> airportBooking;

    public Airline() {
        this.passengerBooking = new HashMap<>();
        this.airportBooking = new ArrayList<>();
    }

    public void bookPassengerToFlight(Passenger passenger1, Flight flight1) {
        passengerBooking.put(passenger1, flight1);
    }

}
