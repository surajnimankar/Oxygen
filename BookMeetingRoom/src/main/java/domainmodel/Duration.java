package domainmodel;

import java.time.LocalDate;
import java.time.LocalTime;

public class Duration {

    private LocalDate bookingDate;
    private LocalTime startTime;
    private LocalTime endTime;

    public Duration(LocalDate bookingDate, LocalTime startTime, LocalTime endTime) {
        this.bookingDate = bookingDate;
        this.startTime = startTime;
        this.endTime = endTime;
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

    public String toString() {

        return ("Duration :[ bookingDate : " + bookingDate + ", startTime : " + startTime
                + ", endTime : " + endTime + " ]");
    }
}
