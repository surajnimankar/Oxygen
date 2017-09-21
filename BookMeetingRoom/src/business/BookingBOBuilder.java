package business;

import java.time.LocalDate;
import java.time.LocalTime;

public class BookingBOBuilder {

    LocalDate bookingDate;
    LocalTime startTime;
    LocalTime endTime;
    Guest guest;
    Room room;

    public BookingBOBuilder withBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
        return this;
    }

    public BookingBOBuilder withStartTime(LocalTime startTime) {
        this.startTime = startTime;
        return this;
    }

    public BookingBOBuilder withEndTime(LocalTime endTime) {
        this.endTime = endTime;
        return this;
    }

    public BookingBOBuilder withGuest(Guest guest) {
        this.guest = guest;
        return this;
    }

    public BookingBOBuilder withRoom(Room room) {
        this.room = room;
        return this;
    }

    public BookingBO build() {
        return new BookingBO(this);
    }
}
