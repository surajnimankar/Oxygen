package service;

import business.Guest;
import business.Room;

import java.time.LocalDate;
import java.time.LocalTime;

public class BookingTOBuilder {

    LocalDate bookingDate;
    LocalTime startTime;
    LocalTime endTime;
    Guest guest;
    Room room;

    public BookingTOBuilder withBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
        return this;
    }

    public BookingTOBuilder withStartTime(LocalTime startTime) {
        this.startTime = startTime;
        return this;
    }

    public BookingTOBuilder withEndTime(LocalTime endTime) {
        this.endTime = endTime;
        return this;
    }

    public BookingTOBuilder withGuest(Guest guest) {
        this.guest = guest;
        return this;
    }

    public BookingTOBuilder withRoom(Room room) {
        this.room = room;
        return this;
    }

    public static BookingTOBuilder fromExistingObject(BookingTO input) {
        return new BookingTOBuilder().withBookingDate(input.bookingDate)
                .withStartTime(input.startTime)
                .withEndTime(input.endTime)
                .withGuest(input.guest)
                .withRoom(input.room);
    }

    public BookingTO build() {
        return new BookingTO(this);
    }
}
