package domainmodel;

public class Guest {

    private String name;
    private String contactNumber;

    public Guest(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String toString() {

        return ("Guest :[ name : " + name + ", contactNumber : " + contactNumber + " ]");
    }
}
