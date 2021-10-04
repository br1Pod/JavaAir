package peopleTests;

import org.junit.Before;
import org.junit.Test;
import people.Pilot;
import people.Rank;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Clarence Oveur", Rank.CAPTAIN, "A01-ROGER");
    }

    @Test
    public void testPilotHasName(){
        assertEquals("Clarence Oveur", pilot.getName());
    }

    @Test
    public void testPilotHasRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void testPilotHasLicenceNo(){
        assertEquals("A01-ROGER", pilot.getLicenceNo());
    }

    @Test
    public void checkPilotIsFlying(){
        assertEquals("I am a leaf on the wind", pilot.flyingMessage());
    }
}
