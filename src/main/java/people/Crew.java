package people;

public class Crew extends Person{

    private Rank rank;

    public Crew(String name, Rank rank) {
        super(name);
        this.rank = rank;
    }

    public Rank getRank(){
        return this.rank;
    }
}
