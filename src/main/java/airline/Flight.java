package airline;

import people.Crew;
import people.Passenger;
import people.Pilot;

import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<Crew> crew;
    private ArrayList<Passenger> passengers;
    private PlaneType planeType;
    private String flightNumber;
    private String destination;
    private String departurePort;
    private String departureTime;

    public Flight(
            PlaneType planeType,
            String flightNumber,
            String destination,
            String departurePort,
            String departureTime
    ) {
        this.pilots = new ArrayList<>();
        this.crew = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.planeType = planeType;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departurePort = departurePort;
        this.departureTime = departureTime;
    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public void setPilots(ArrayList<Pilot> pilots) {
        this.pilots = pilots;
    }

    public void addPilots(Pilot pilot){
        this.pilots.add(pilot);
    }

    public int noOfPilots(){
        return this.pilots.size();
    }

    public ArrayList<Crew> getCrew() {
        return crew;
    }

    public void setCrew(ArrayList<Crew> crew) {
        this.crew = crew;
    }

    public void addCrew(Crew steward) {
        this.crew.add(steward);
    }

    public int flightHasCrew(){
        return this.crew.size();
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public void addPassengers(Passenger passenger){
        this.passengers.add(passenger);
    }

    public int passengersOnFlight(){
        return passengers.size();
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeparturePort() {
        return departurePort;
    }

    public void setDeparturePort(String departurePort) {
        this.departurePort = departurePort;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getAvailableSeats() {
        return this.planeType.getCapacity() - this.passengersOnFlight();
    }

    public void bookSeat(Passenger passenger){
        this.passengers.add(passenger);
    }

    public boolean canBookSeat(){
        if (this.planeType.getCapacity() > this.getAvailableSeats()){
            return true;
        } else {
            return false;
        }
    }


}
