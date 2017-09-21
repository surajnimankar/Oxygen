package business;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class BookingBO implements Serializable {
    LocalDate bookingDate;
    LocalTime startTime;
    LocalTime endTime;
    Guest guest;
    Room room;

    private BookingBO() {}

    public BookingBO(BookingBOBuilder builder) {
        this.bookingDate = builder.bookingDate;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.guest = builder.guest;
        this.room = builder.room;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public Guest getGuest() {
        return guest;
    }

    public Room getRoom() {
        return room;
    }

    public String toString() {
        return ("BookingBO :[ BookingDate : " + bookingDate + ", startTime : " + startTime + " , " +
                "endTime : " + endTime + " , "  + "Guest :  " + guest + " , " +
                "Room : " + room + "]");
    }
}
