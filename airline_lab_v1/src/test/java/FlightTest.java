import data.Flight;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FlightTest {

    private Flight flight;

    @BeforeEach
    public void setUp() {
        flight = new Flight("BA1234", "London", "Istanbul", 12.00,
                3.00, 100);
    }

}
