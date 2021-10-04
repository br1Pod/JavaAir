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

    public String publicAnnouncement(){
        return "Ladies and gentlemen, this is your stewardess speaking... We regret any inconvenience the sudden cabin movement might have caused, this is due to periodic air pockets we encountered, there's no reason to become alarmed, and we hope you enjoy the rest of your flight... By the way, is there anyone on board who knows how to fly a plane?";
    }
}
