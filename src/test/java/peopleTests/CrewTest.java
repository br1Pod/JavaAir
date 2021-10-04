package peopleTests;

import org.junit.Before;
import org.junit.Test;
import people.Crew;
import people.Rank;

import static org.junit.Assert.assertEquals;

public class CrewTest {

    Crew crew;

    @Before
    public void before() {
        crew = new Crew("Otto", people.Rank.AUTOMATIC_PILOT);
    }

    @Test
    public void getCrewMemberName(){
        assertEquals("Otto", crew.getName());
    }

    @Test
    public void getCrewMemberRank(){
        assertEquals(Rank.AUTOMATIC_PILOT, people.Rank.AUTOMATIC_PILOT);
    }

    @Test
    public void checkStewardCanAddressPublic(){
        assertEquals("Ladies and gentlemen, this is your stewardess speaking... We regret any inconvenience the sudden cabin movement might have caused, this is due to periodic air pockets we encountered, there's no reason to become alarmed, and we hope you enjoy the rest of your flight... By the way, is there anyone on board who knows how to fly a plane?", crew.publicAnnouncement());
    }

}

