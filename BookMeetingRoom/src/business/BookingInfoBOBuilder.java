package business;

import service.BookingInfoTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class BookingInfoBOBuilder {

    LocalDate bookingDate;
    LocalTime startTime;
    LocalTime endTime;

    public BookingInfoBOBuilder withBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
        return this;
    }

    public BookingInfoBOBuilder withStartTime(LocalTime startTime) {
        this.startTime = startTime;
        return this;
    }

    public BookingInfoBOBuilder withEndTime(LocalTime endTime) {
        this.endTime = endTime;
        return this;
    }

    public BookingInfoBO build() {
        return new BookingInfoBO(this);
    }
}
