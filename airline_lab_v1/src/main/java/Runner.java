import data.Flight;
import data.Passenger;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        AirportBooking airportBooking = new AirportBooking();
        Airline airline = new Airline();

        Flight flight1 = new Flight("BA1234", "London", "Istanbul", 12.00,
                3.00, 150);
        Flight flight2 = new Flight("BA5678", "Edinburgh", "Malaga", 11.00,
                2.00, 90);
        Flight flight3 = new Flight("BA9876", "Manchester", "Paris", 10.00,
                12.00, 45);

        airportBooking.addNewFlight(flight1);
        airportBooking.addNewFlight(flight2);
        airportBooking.addNewFlight(flight3);

        System.out.println("Welcome to our Airline! Would you like to see our flights?");

        // Collect user input
        Scanner reader = new Scanner(System.in);
        String userInput = reader.nextLine();

//        // attempting to set up exceptions

//        String result;
//
//        try {
//            String result = userInput.compareTo("Yes");
//                //airportBooking.displayAvailableFlights();
//
//        } catch (Exception exception) {
//            result = exception.getMessage();
//        }

        if (userInput.equals("Yes")) {
            airportBooking.displayAvailableFlights();
        } else {
            System.out.println("Have a lovely day!");
        }

        System.out.println("------------------------------");

        System.out.println("Please provide us your details. What is your name? ");

        String userName = reader.nextLine();

        System.out.println("What is your nationality? ");

        String userNationality = reader.nextLine();

        System.out.println("What is your email? ");

        String userEmail = reader.nextLine();

        System.out.println("Please provide us your passport number: ");

        long userPassportNumber = reader.nextLong();

        System.out.println("What is your contact number? ");

        long userContactNumber = reader.nextLong();

        Passenger passenger1 = new Passenger(userName, userPassportNumber, userNationality, userEmail, userContactNumber);

        airportBooking.addNewPassenger(passenger1);

        passenger1.displayPassengerDetails();

        System.out.println("------------------------------");

        // Collect user input
        Scanner reader2 = new Scanner(System.in);

        System.out.println("Please choose a flight number (without the hash symbol): ");

        String userFlightNumber = reader2.nextLine();

        for(int i = 0; i < airportBooking.getFlightList().size(); i++) {
            if (userFlightNumber.equals(airportBooking.getFlightList().get(i).getFlightNumber())) {
                System.out.println("Please confirm that this is the correct flight: ");
                System.out.println("");
                airportBooking.getFlightList().get(i).displayFlightDetail();
                Flight flightChosen = airportBooking.getFlightList().get(i);
                String userFlightConfirmation = reader2.nextLine();
                if (userFlightConfirmation.equals("Yes")) {
                    airline.bookPassengerToFlight(passenger1, flightChosen);
                    System.out.println("You have booked the #" + flightChosen.getFlightNumber() + " flight to " + flightChosen.getTo().substring(0,1).toUpperCase() + flightChosen.getTo().substring(1).toLowerCase() + "!");
                }
            }
        }

//        Flight passenger1Booking = airline.passengerBooking.get(0);
//        System.out.println(passenger1Booking);

    }

}
