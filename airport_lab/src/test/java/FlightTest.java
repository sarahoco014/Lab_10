import models.Flight;
import models.Passenger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlightTest {

    Flight flight;
    Passenger passenger;

    @BeforeEach
    public void setUp() {
        flight = new Flight("Madrid", 123456);
    }

    @Test
    public void canGetDestination() {
        assertThat(flight.getDestination()).isEqualTo("Madrid");
    }

    @Test
    public void canSetDestination() {
        flight.setDestination("Paris");
        assertThat(flight.getDestination()).isEqualTo("Paris");
    }

    @Test
    public void canGetFlightId() {
        assertThat(flight.getFlightId()).isEqualTo(123456);
    }

    @Test
    public void canSetFlightId() {
        flight.setFlightId(234567);
        assertThat(flight.getFlightId()).isEqualTo(234567);
    }

    @Test
    public void canGetPassList() {
        ArrayList<Passenger> expected = new ArrayList<Passenger>();
        assertThat(flight.getPassList()).isEqualTo(expected);
    }

    @Test
    public void canSetPassList() {
        Passenger passenger1 = new Passenger("Tarek", 3456789);
        ArrayList<Passenger> expected = new ArrayList<Passenger>();
        expected.add(passenger1);

        flight.setPassList();
    }

    @Test
    public void canAddPassList() {
        Passenger passenger1 = new Passenger("Tarek", 456789);
        ArrayList<Passenger> expected = new ArrayList<Passenger>();
        expected.add(passenger1);

        flight.addPassList(passenger1);

        assertThat(flight.getPassList()).isEqualTo(expected);
    }

    @Test
    public void canGeneID() {
        flight.geneID();
        System.out.println("Unique ID :" + flight.geneID());
    }
}
