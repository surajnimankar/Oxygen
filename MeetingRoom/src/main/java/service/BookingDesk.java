package service;

import business.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface BookingDesk {


    boolean checkAvailability(BookingTO information);
    List<Room> getAllRooms();
    String makeBooking(BookingTO information);
    void updateBooking(String bookingNumber, BookingTO information);
    void deleteBooking(String bookingNumber);
    void getAllBookingsOfTheDay(LocalDate date);

}
