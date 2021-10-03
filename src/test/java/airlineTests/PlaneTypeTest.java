package airlineTests;

import airline.Plane;
import airline.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTypeTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void checkPlaneType(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }
}

