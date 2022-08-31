import data.Flight;
import data.Passenger;

import java.util.ArrayList;
import java.util.Scanner;

public class AirportBooking {

    ArrayList<Passenger> passengerList;
    ArrayList<Flight> flightList;

    public AirportBooking() {
        this.passengerList = new ArrayList<>();
        this.flightList = new ArrayList<>();
    }

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }

    public ArrayList<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(ArrayList<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    // method to add a new flight
    public void addNewFlight (Flight flight) {
        this.flightList.add(flight);
    }

    // method to remove a flight
    public void removeFlight (Flight flight) {
        this.flightList.remove(flight);
    }

    // method to display all available flights
    public void displayAvailableFlights() {
        for (int i = 0; i < flightList.size(); i++) {
            getFlightList().get(i).displayFlightDetail();
        }
    }

    // method to add a new passenger
    public void addNewPassenger (Passenger passenger) {
        this.passengerList.add(passenger);
    }

}
