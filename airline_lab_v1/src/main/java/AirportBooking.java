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

    public void displayFlightsDetails() {
        int index = 1;
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------------");
        for (Flight flight : flightList) {
            System.out.println("                                                 " + index + "-");
            flight.displayFlightDetail();
            index++;
            System.out.println(
                    "------------------------------------------------------------------------------------------------------------------------------");
        }
    }

//    public void displayFlightDetail() {
//        for (Flight flight : flightList) {
//            flight.DisplayFlightDetail();
//            index++;
//            System.out.println(
//        }

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public void displayAvailableFlights() {
        for (int i = 0; i < flightList.size(); i++) {
            getFlightList().get(i).displayFlightDetail();
        }
    }

    // method to add a new flight
    public void addNewFlight (Flight flight) {
        this.flightList.add(flight);
    }

    public void removeFlight (Flight flight) {
        this.flightList.remove(flight);
    }

    public void addNewPassenger (Passenger passenger) {
        this.passengerList.add(passenger);
    }

}
