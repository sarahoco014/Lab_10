import models.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PassengerTest {

    Passenger passenger;

    @BeforeEach
    public void setUp(){
        passenger = new Passenger("Tarek","07748598697");
        passenger.setPassID();

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
    public void canGetPId(){
        System.out.println("Get passenger ID: "+passenger.getPassID());

    }
    @Test
    public void canSetPId(){
        Passenger p2 = new Passenger("Sarah","07212121212");
        p2.setPassID();
        System.out.println("Set passenger ID: "+p2.getPassID());
    }

    @Test
    public void canGeneID(){
        passenger.geneID();
        System.out.println("Unique ID :" + passenger.geneID());

    }
}
