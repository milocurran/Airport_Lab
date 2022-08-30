import data.Flight;
import data.Passenger;

import java.util.ArrayList;
import java.util.Scanner;

public class AirportBooking {

    ArrayList<Passenger> passengerList = new ArrayList<Passenger>();
    ArrayList<Flight> flightList = new ArrayList<Flight>();

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




}
