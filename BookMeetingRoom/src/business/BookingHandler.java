package business;

import java.time.LocalDate;
import java.util.Map;

public interface BookingHandler {

    boolean checkAvailability(BookingBO information);
    // RETURN booking NUMBER
    String makeBooking(BookingBO information);
    void updateBooking(String bookingNumber, BookingBO businessObject);
    void deleteBooking(String bookingNumber);
    Map<String, BookingBO> getAllBookingsOfTheDay(LocalDate date);
}
