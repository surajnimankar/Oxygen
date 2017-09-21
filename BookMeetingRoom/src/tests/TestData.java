package tests;

import business.BookingBO;
import business.BookingBOBuilder;
import business.Guest;
import business.Room;
import service.BookingTO;
import service.BookingTOBuilder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TestData {

    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

    public static BookingTO createBookingTO() {

        LocalDate bookingDate = LocalDate.parse("21/09/2017", formatter);
        LocalTime startTime = LocalTime.parse("09:00");
        LocalTime endTime = LocalTime.parse("12:00");

        BookingTO transferObject = new BookingTOBuilder().withBookingDate(bookingDate)
                .withStartTime(startTime)
                .withEndTime(endTime)
                .withGuest(new Guest("Suraj", "12345"))
                .withRoom(Room.ROOM_SMALL)
                .build();

        return transferObject;
    }

    public static BookingBO createBookingBO() {
        LocalDate bookingDate = LocalDate.parse("21/09/2017", formatter);
        LocalTime startTime = LocalTime.parse("09:00");
        LocalTime endTime = LocalTime.parse("12:00");

        BookingBO businessObject = new BookingBOBuilder().withBookingDate(bookingDate)
                .withStartTime(startTime)
                .withEndTime(endTime)
                .withGuest(new Guest("Sachin", "12345"))
                .withRoom(Room.ROOM_LARGE)
                .build();

        return businessObject;

    }
}
