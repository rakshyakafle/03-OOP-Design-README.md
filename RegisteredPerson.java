//RakshyaKafle
//AdvanceJava
//RegisteredPerson

public class RegisteredPerson extends Person {
    private String govID;

    public RegisteredPerson(String firstName, String lastName, String govID) {
        super(firstName, lastName);
        this.govID = govID;
    }

    // Special constructor: Create from existing Person + ID
    public RegisteredPerson(Person p, String govID) {
        super(p.getFirstName(), p.getLastName());
        this.govID = govID;
    }

    public String getGovID() { return govID; }

    @Override
    public String toString() {
        return super.toString() + ", Gov ID: " + govID;
    }
}