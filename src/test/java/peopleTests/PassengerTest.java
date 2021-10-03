package peopleTests;

import org.junit.Before;
import org.junit.Test;
import people.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Ted Striker", 20);
    }

    @Test
    public void checkPassengerHasName(){
        assertEquals("Ted Striker", passenger.getName());
    }

    @Test
    public void checkPassengerHasBaggage(){
        assertEquals(20, passenger.getBaggage());
    }
}
