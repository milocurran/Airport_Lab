import data.Flight;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirportBookingTest {

    private ArrayList flightList;

    AirportBooking airportBooking = new AirportBooking();

    @BeforeEach
    public void setUp() {
        flightList = new ArrayList<>();
    }

    @Test
    public void canAddNewFlight() {
        Flight flight1 = new Flight("BA1234", "London", "Istanbul", 12.00,
                3.00, 150);
        Flight flight2 = new Flight("BA5678", "Edinburgh", "Malaga", 11.00,
                2.00, 90);
        Flight flight3 = new Flight("BA9876", "Manchester", "Paris", 10.00,
                12.00, 45);
        airportBooking.addNewFlight(flight1);
        airportBooking.addNewFlight(flight2);
        airportBooking.addNewFlight(flight3);
        int expected = 3;
        int actual = airportBooking.getFlightList().size();
        assertEquals(expected, actual);
    }

    @Test
    public void canRemoveFlight() {
        Flight flight1 = new Flight("BA1234", "London", "Istanbul", 12.00,
                3.00, 150);
        Flight flight2 = new Flight("BA5678", "Edinburgh", "Malaga", 11.00,
                2.00, 90);
        Flight flight3 = new Flight("BA9876", "Manchester", "Paris", 10.00,
                12.00, 45);
        airportBooking.addNewFlight(flight1);
        airportBooking.addNewFlight(flight2);
        airportBooking.addNewFlight(flight3);
        airportBooking.removeFlight(flight1);
        int expected = 2;
        int actual = airportBooking.getFlightList().size();
        assertEquals(expected, actual);
    }

}
