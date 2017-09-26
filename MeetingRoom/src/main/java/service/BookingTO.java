package service;

import business.Guest;
import business.Room;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class BookingTO implements Serializable {
    LocalDate bookingDate;
    LocalTime startTime;
    LocalTime endTime;
    Guest guest;
    Room room;

    private BookingTO() {}

    public BookingTO(BookingTOBuilder builder) {
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
        return ("BookingTO :[ BookingDate : " + bookingDate + ", startTime : " + startTime + " , " +
                "endTime : " + endTime + " , "  + "Guest :  " + guest + " , " +
                "Room : " + room + "]");
    }
}
