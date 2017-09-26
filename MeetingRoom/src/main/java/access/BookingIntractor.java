package access;

import java.time.LocalDate;
import java.util.Map;

public interface BookingIntractor {

    // RETURN booking NUMBER
    String makeBooking(BookingDAO daoObject);
    void udpateBooking(String bookingNumber, BookingDAO daoObject);
    void deleteBooking(String bookingNumber);
    Map<String, BookingDAO> getAllBookingsOfTheDay(LocalDate date);
}
