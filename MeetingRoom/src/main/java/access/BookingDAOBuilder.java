package access;

import business.Guest;
import business.Room;

import java.time.LocalDate;
import java.time.LocalTime;

public class BookingDAOBuilder {
    LocalDate bookingDate;
    LocalTime startTime;
    LocalTime endTime;
    Guest guest;
    String bookingNumber;
    Room room;

    public BookingDAOBuilder withBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
        return this;
    }

    public BookingDAOBuilder withstartTime(LocalTime startTime) {
        this.startTime = startTime;
        return this;
    }

    public BookingDAOBuilder withEndTime(LocalTime endTime) {
        this.endTime = endTime;
        return this;
    }

    public BookingDAOBuilder withGuest(Guest guest) {
        this.guest = guest;
        return this;
    }

    public BookingDAOBuilder withBookingNumber(String bookingNumber) {
        this.bookingNumber = bookingNumber;
        return this;
    }

    public BookingDAOBuilder withRoom(Room room) {
        this.room = room;
        return this;
    }


    public BookingDAO build() {
        return new BookingDAO(this);
    }

}
