package airline;

public enum PlaneType {

    BOEING727(400, 10000.00),
    BOEING737(500, 12500.00),
    BOEING747(600, 15000.00);

    private final int capacity;
    private final double weight;

    PlaneType(int capacity, double weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }
}
