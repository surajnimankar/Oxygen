package business;

import access.BookingDAO;
import access.BookingIntractor;
import access.BookingIntractorImpl;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingHandlerImpl implements BookingHandler {

    private BookingIntractor intractor = new BookingIntractorImpl();
    BusinessObjMapper mapper = new BusinessObjMapper();

    public List<Room> getAllRooms() {
        return Arrays.asList(Room.values());
    }

    @Override
    public boolean checkAvailability(BookingBO information) {

        return true;
    }

    @Override
    public String makeBooking(BookingBO businessObject) {
        BookingDAO daoObject = mapper.toDAOObject(businessObject);

        return intractor.makeBooking(daoObject);
    }

    @Override
    public void updateBooking(String bookingNumber, BookingBO businessObject) {
        BookingDAO daoObject = mapper.toDAOObject(businessObject);
        intractor.udpateBooking(bookingNumber, daoObject);
    }

    @Override
    public void deleteBooking(String bookingNumber) {
        intractor.deleteBooking(bookingNumber);
    }

    @Override
    public Map<String, BookingBO> getAllBookingsOfTheDay(LocalDate date) {
        Map<String, BookingBO> result = new HashMap<>();
        Map<String, BookingDAO> bookings = intractor.getAllBookingsOfTheDay(date);
        for(int i = 0; i< bookings.size(); i++) {
            //BookingBO businessObject = mapper.fromDAOObject(bookings.)
        }
        return null;
    }
}
