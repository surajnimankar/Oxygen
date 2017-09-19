package service;

import java.time.LocalDate;
import java.time.LocalTime;

public class BookingInfoTOBuilder {

    LocalDate bookingDate;
    LocalTime startTime;
    LocalTime endTime;

    BookingInfoTOBuilder withBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
        return this;
    }

    BookingInfoTOBuilder withStartTime(LocalTime startTime) {
        this.startTime = startTime;
        return this;
    }

    BookingInfoTOBuilder withEndTime(LocalTime endTime) {
        this.endTime = endTime;
        return this;
    }

    public BookingInfoTO build() {
        return new BookingInfoTO(this);
    }
}
