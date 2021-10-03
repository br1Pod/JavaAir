package people;

public class Passenger extends Person{

    private int baggage;

    public Passenger(String name, int baggage){
        super(name);
        this.baggage = baggage;
    }

    public int getBaggage() {
        return baggage;
    }

    public void setBaggage(int baggage) {
        this.baggage = baggage;
    }
}
