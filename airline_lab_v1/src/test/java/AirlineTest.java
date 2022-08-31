import data.Flight;
import data.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirlineTest {

    private Passenger passenger1;
    private Passenger passenger2;

    private Flight flight1;
    private HashMap<Passenger, Flight> passengerBooking;

    @BeforeEach
    public void setUp() {
        passenger1 = new Passenger("Colin", 123456789, "British", "colin@email.com", 071234567);
        flight1 = new Flight("BA1234", "London", "Istanbul", 12.00,
                3.00, 150);
        passenger2 = new Passenger("Iain", 987654321, "British", "iain@email.com", 077654321);
        passengerBooking = new HashMap<>();
    }

    @Test
    public void canBookPassengerToFlight() {
        passengerBooking.put(passenger1, flight1);
        passengerBooking.put(passenger2, flight1);
        int expected = 2;
        int actual = passengerBooking.size();
        assertEquals(expected, actual);
    }

}
