import data.Flight;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        AirportBooking airportBooking = new AirportBooking();

        Flight flight1 = new Flight("BA1234", "London", "Istanbul", 12.00,
                3.00, 100, 150);
        Flight flight2 = new Flight("BA5678", "Edinburgh", "Malaga", 11.00,
                2.00, 100, 90);
        Flight flight3 = new Flight("BA9876", "Manchester", "Paris", 10.00,
                12.00, 100, 45);

        airportBooking.addNewFlight(flight1);
        airportBooking.addNewFlight(flight2);
        airportBooking.addNewFlight(flight3);

        System.out.println("Welcome to our Airline! Would you like to see our flights?");

        // Collect user input
        Scanner reader = new Scanner(System.in);
        String userInput = reader.nextLine();

        if (userInput.equals("Yes")) {
            airportBooking.displayAvailableFlights();
        } else {
            System.out.println("Have a lovely day!");
        }

        System.out.println("------------------------------");

        System.out.println("Please choose a flight number: ");

        String userFlightNumber = reader.nextLine();

        if (userFlightNumber.contains(airportBooking.) ) {

        }


    }

}
