import models.Flight;
import models.Passenger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlightTest {

    Flight flight;

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
    public void canGetPassList() {
        ArrayList<Passenger> expected = new ArrayList<>();
        assertThat(flight.getPassList()).isEqualTo(expected);
    }
    
    @Test
    public void canAddPassenger() {
        Passenger passenger1 = new Passenger("Tarek", "456789");
        ArrayList<Passenger> expected = new ArrayList<Passenger>();
        expected.add(passenger1);

        flight.addPassenger(passenger1);

        assertThat(flight.getPassList()).isEqualTo(expected);
    }

    @Test
    public void canRemovePassenger() {

    }

    @Test
    public void canGeneID(){
        int beforeAssignment = flight.getFlightId();
        flight.generateId();
        int afterAssigment = flight.getFlightId();
        assertThat(beforeAssignment).isNotEqualTo(afterAssigment);
    }
}