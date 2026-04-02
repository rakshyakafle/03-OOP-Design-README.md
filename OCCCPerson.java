//Rakshya Kafle
//Advance Java
//OCCC Person

public class OCCCPerson extends RegisteredPerson {
    private String studentID;

    public OCCCPerson(String firstName, String lastName, String govID, String studentID) {
        super(firstName, lastName, govID);
        this.studentID = studentID;
    }

    // Special constructor: Create from existing RegisteredPerson + ID
    public OCCCPerson(RegisteredPerson rp, String studentID) {
        super(rp.getFirstName(), rp.getLastName(), rp.getGovID());
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return super.toString() + ", Student ID: " + studentID;
    }
}