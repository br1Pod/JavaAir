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

}

