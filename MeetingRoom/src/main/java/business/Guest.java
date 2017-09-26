package business;

public class Guest {

    String name;
    String contactNumber;

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
        return ("Guest :[ Name : " + name + ", ContactNumber : " + contactNumber + " ]");
    }
}
