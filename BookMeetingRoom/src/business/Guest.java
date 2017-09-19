package business;

public class Guest {

    static int id = 0;
    String name;
    String contactNumber;

    public Guest(String name, String contactNumber) {
        id = id++;
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}
