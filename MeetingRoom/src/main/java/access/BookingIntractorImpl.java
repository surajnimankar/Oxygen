package access;

import java.time.LocalDate;
import java.util.Map;

public class BookingIntractorImpl implements BookingIntractor {
    @Override
    public String makeBooking(BookingDAO daoObject) {

        return InMemoryDatabase.create(daoObject);
    }

    @Override
    public void udpateBooking(String bookingNumber, BookingDAO daoObject) {
        InMemoryDatabase.update(bookingNumber, daoObject);
    }

    @Override
    public void deleteBooking(String bookingNumber) {
        InMemoryDatabase.delete(bookingNumber);
    }

    @Override
    public Map<String, BookingDAO> getAllBookingsOfTheDay(LocalDate date) {
        return InMemoryDatabase.getAllBookingsOfTheDay(date);
    }
}
