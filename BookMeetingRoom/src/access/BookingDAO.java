package access;

import business.Guest;

import java.util.Date;
import java.util.Timer;

public class BookingDAO {
    static int id = 0;
    Date bookingDate;
    Timer startTime;
    Timer endTime;
    Guest guest;
    String bookingNumber;

    public BookingDAO(Date bookingDate, Timer startTime, Timer endTime, Guest guest) {
        this.id = id++;
        this.bookingDate = bookingDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.guest = guest;
        this.bookingNumber = getBookingNumber();
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public Timer getStartTime() {
        return startTime;
    }

    public Timer getEndTime() {
        return endTime;
    }

    public Guest getGuest() {
        return guest;
    }

    public String getBookingNumber() {
        return getGuest().getName() + "_" + id;
    }
}

