package access;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InMemoryDatabase {
    private static Map<String, BookingDAO> booking = new HashMap<>();
    private static int counter = 1;

    public static String create(BookingDAO daoObject) {
        String bookingNumber = daoObject.getGuest().getName() + "_" + counter;
        booking.put(bookingNumber, daoObject);
        counter++;
        System.out.println();
        System.out.println(booking);
        return bookingNumber;
    }

    public static void update(String bookingNumber, BookingDAO daoObject) {
        BookingDAO oldBooking = booking.remove(bookingNumber);
        booking.put(bookingNumber, daoObject);
        System.out.println();
        System.out.println(booking);

    }

    public static void delete(String bookingNumber) {
        BookingDAO oldBooking = booking.remove(bookingNumber);
        System.out.println();
        System.out.println(booking);

    }

    public static Map<String, BookingDAO> getAllBookingsOfTheDay(LocalDate date) {
        return booking;
    }


}
