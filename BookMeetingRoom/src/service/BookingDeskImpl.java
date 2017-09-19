package service;

import business.BookingHandler;
import business.BookingInfoBO;
import business.Guest;

public class BookingDeskImpl implements BookingDesk {

    // Later on to be injected and made available from constructor
    private BookingHandler handler = new BookingHandler();
    private TransferObjectMapper mapper = new TransferObjectMapper();

    @Override
    public boolean checkAvailability(BookingInfoTO transferObject) {
        BookingInfoBO businessObject = mapper.toBusinessObject(transferObject);
        return handler.checkAvailability(businessObject);
    }

    @Override
    public String makeBooking(BookingInfoTO transferObject, Guest guest) {
        if(checkAvailability(transferObject)) {
            // make booking and return booking number
            // map TO with BO and call business layer
            BookingInfoBO businessObject = mapper.toBusinessObject(transferObject);
            return handler.makeBooking(businessObject, guest);
        }
        // return meaningful message
        return null;
    }

    @Override
    public void udpateBooking(String bookingNumber, BookingInfoTO information) {
        // check for valid BookingNumber, if then update booking
        // else return meaningfula message

    }
}
