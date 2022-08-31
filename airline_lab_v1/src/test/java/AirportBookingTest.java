import data.Flight;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirportBookingTest {

    private AirportBooking flightList;


    @BeforeEach
    public void setUp() {
//        flight = new Flight("BA1234", "London", "Istanbul", 12.00,
//                3.00, 100, 150);
        flightList = new AirportBooking();
//        flightList.addNewFlight(flight);
    }

    // FIX LATER

//    @Test
//    public void canDisplayFlightDetails() {
//        Flight flight = new Flight("BA1234", "London", "Istanbul", 12.00,
//                3.00, 100, 150);
//        flightList.addNewFlight(flight);
//        String expected = "BA1234 London Istanbul 12.00 3.00 100 150";
//        String actual = flightList.displayAvailableFlights();
//        assertEquals(expected, actual);
//    }
}
