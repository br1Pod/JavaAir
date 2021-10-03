package people;

public class Pilot extends Crew{

    private String licenceNo;

    public Pilot(String name, Rank rank, String licenceNo) {
        super(name, rank);
        this.licenceNo = licenceNo;
    }

    public String getLicenceNo(){
        return this.licenceNo;
    }

    public void setLicenceNo(){
        this.licenceNo = licenceNo;
    }

    public String flyingMessage(){
        return "I am a leaf on the wind";
    }

}
