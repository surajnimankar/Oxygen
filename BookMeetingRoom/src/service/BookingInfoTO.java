package service;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Timer;

public class BookingInfoTO implements Serializable {
    LocalDate bookingDate;
    LocalTime startTime;
    LocalTime endTime;

    private BookingInfoTO() {}

    public BookingInfoTO(BookingInfoTOBuilder builder) {
        this.bookingDate = builder.bookingDate;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
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
}
