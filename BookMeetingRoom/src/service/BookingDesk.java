package service;

import business.Guest;

public interface BookingDesk {


    boolean checkAvailability(BookingInfoTO information);
    // RETURN booking NUMBER
    String makeBooking(BookingInfoTO information, Guest guest);
    void udpateBooking(String bookingNumber, BookingInfoTO information);

}
