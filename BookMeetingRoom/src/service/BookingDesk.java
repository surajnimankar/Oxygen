package service;

import java.time.LocalDate;

public interface BookingDesk {


    boolean checkAvailability(BookingTO information);
    // RETURN booking NUMBER
    String makeBooking(BookingTO information);
    void udpateBooking(String bookingNumber, BookingTO information);
    void deleteBooking(String bookingNumber);
    void getAllBookingsOfTheDay(LocalDate date);

}
