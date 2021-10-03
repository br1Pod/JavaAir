package airlineTests;

import airline.Flight;
import airline.Plane;
import airline.PlaneType;
import org.junit.Before;
import org.junit.Test;
import people.Crew;
import people.Passenger;
import people.Pilot;
import people.Rank;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    private Pilot pilot;
    private Crew steward;
    private Passenger passenger_1;
    private Passenger passenger_2;
    private Flight flight;

    @Before
    public void before(){
        pilot = new Pilot("Clarence Oveur", Rank.CAPTAIN, "A01-ROGER");
        steward = new Crew("Elaine Dickinson", Rank.STEWARD);
        passenger_1 = new Passenger("Ted Striker", 20);
        passenger_2 = new Passenger("Dr Rumack", 2);
        flight = new Flight(PlaneType.BOEING747, "FL01", "EDI", "GLA", "10.00");
    }

    @Test
    public void flightHasPilot(){
        flight.addPilots(pilot);
        assertEquals(1, flight.noOfPilots());
    }

    @Test
    public void flightHasCrew(){
        flight.addCrew(steward);
        assertEquals(1, flight.flightHasCrew());
    }

    @Test
    public void flightHasPassengers(){
        flight.addPassengers(passenger_1);
        flight.addPassengers(passenger_2);
        assertEquals(2,flight.passengersOnFlight());
    }

    @Test
    public void flightHasPlane(){
        assertEquals(PlaneType.BOEING747, flight.getPlaneType());
    }

    @Test
    public void checkFlightHasFlightNumber(){
        assertEquals("FL01", flight.getFlightNumber());
    }

}
