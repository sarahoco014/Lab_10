import models.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PassengerTest {

    Passenger passenger;

    @BeforeEach
    public void setUp(){
        passenger = new Passenger("Tarek","07748598697");
    }
    @Test
    public void canGetName(){
        assertThat(passenger.getName()).isEqualTo("Tarek");
    }
    @Test
    public void canSetName(){
        passenger.setName("Sarah");
        assertThat(passenger.getName()).isEqualTo("Sarah");
    }

    @Test
    public void canGetPhoneNumber(){
        assertThat(passenger.getPhoneNumber()).isEqualTo("07748598697");
    }
    @Test
    public void canSetPhoneNumber(){
        passenger.setPhoneNumber("0909090909");
        assertThat(passenger.getPhoneNumber()).isEqualTo("0909090909");
    }

    @Test
    public void canGeneID(){
        String beforeAssignment = passenger.getPassportNumber();
        passenger.generateId();
        String afterAssigment = passenger.getPassportNumber();
        assertThat(beforeAssignment).isNotEqualTo(afterAssigment);
    }
}
