import data.Flight;
import data.Passenger;

import java.util.ArrayList;
import java.util.Scanner;

public class AirportBooking {

    ArrayList<Passenger> passengerList = new ArrayList<Passenger>();
    ArrayList<Flight> flightList = new ArrayList<Flight>();

    private ArrayList<ArrayList> completeFlightList;

    private ArrayList<ArrayList> completePassengerList;

    public AirportBooking() {
        this.completeFlightList = new ArrayList<>();
        this.completePassengerList = new ArrayList<>();
    }

    public void displayFlightsDetails() {
        int index = 1;
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------------");
        for (Flight flight : flightList) {
            System.out.println("                                                 " + index + "-");
            flight.DisplayFlightDetail();
            index++;
            System.out.println(
                    "------------------------------------------------------------------------------------------------------------------------------");
        }
    }

    // method to add a new flight
    public void addNewFlight (Flight id, Flight flightNumber, Flight from, Flight to,
                              Flight departureTime, Flight arrivalTime) {
        this.flightList.add(id);
        this.flightList.add(flightNumber);
        this.flightList.add(from);
        this.flightList.add(to);
        this.flightList.add(departureTime);
        this.flightList.add(arrivalTime);
        this.completeFlightList.add(flightList);
    }

    // method to add a new passenger
    public void addNewPassenger(Passenger passengerID, Passenger name, Passenger mobileNumber,
                                Passenger email, Passenger passportNumber, Passenger nationality) {
        this.passengerList.add(passengerID);
        this.passengerList.add(name);
        this.passengerList.add(mobileNumber);
        this.passengerList.add(email);
        this.passengerList.add(passportNumber);
        this.passengerList.add(nationality);
        this.completePassengerList.add(passengerList);
    }



}
