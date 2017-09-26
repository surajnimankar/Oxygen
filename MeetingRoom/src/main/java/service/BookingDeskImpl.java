package service;

import business.BookingBO;
import business.BookingHandler;
import business.BookingHandlerImpl;
import business.Room;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class BookingDeskImpl implements BookingDesk {

    // Later on to be injected and made available from constructor
    private BookingHandler handler = new BookingHandlerImpl();
    private TransferObjMapper mapper = new TransferObjMapper();

    @Override
    public boolean checkAvailability(BookingTO transferObject) {
        BookingBO businessObject = mapper.toBusinessObject(transferObject);
        return handler.checkAvailability(businessObject);
    }

    @Override
    public List<Room> getAllRooms() {
       return handler.getAllRooms();
    }

    @Override
    public String makeBooking(BookingTO transferObject) {
        if(checkAvailability(transferObject)) {
            BookingBO businessObject = mapper.toBusinessObject(transferObject);
            return handler.makeBooking(businessObject);
        }
        // return meaningful message
        return null;
    }

    @Override
    public void updateBooking(String bookingNumber, BookingTO transferObject) {
        BookingBO businessObject = mapper.toBusinessObject(transferObject);
        handler.updateBooking(bookingNumber, businessObject);
    }

    @Override
    public void deleteBooking(String bookingNumber) {
        handler.deleteBooking(bookingNumber);
    }

    @Override
    public void getAllBookingsOfTheDay(LocalDate date) {
        handler.getAllBookingsOfTheDay(date);

    }
}
