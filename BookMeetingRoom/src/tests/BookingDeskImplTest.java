package tests;

import service.BookingDeskImpl;
import service.BookingTO;
import service.BookingTOBuilder;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class BookingDeskImplTest {
    private BookingDeskImpl impl;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        impl = new BookingDeskImpl();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        impl = null;
    }

    @org.junit.jupiter.api.Test
    void checkAvailability() {
    }

    @org.junit.jupiter.api.Test
    void makeBooking() {
        String bookingNumber = impl.makeBooking(TestData.createBookingTO());
        assertEquals("Suraj_1", bookingNumber);
    }

    @org.junit.jupiter.api.Test
    void udpateBooking() {
        String bookingNumber = "Suraj_1";
        LocalDate bookingDate = LocalDate.parse("30/09/2017", TestData.formatter);
        LocalTime startTime = LocalTime.parse("15:00");
        LocalTime endTime = LocalTime.parse("18:00");
        BookingTO updatedBooking = BookingTOBuilder.fromExistingObject(TestData.createBookingTO())
                .withBookingDate(bookingDate)
                .withStartTime(startTime)
                .withEndTime(endTime)
                .build();
        impl.updateBooking(bookingNumber, updatedBooking);
    }

    @org.junit.jupiter.api.Test
    void deleteBooking() {
        String bookingNumber = "Suraj_1";
        impl.deleteBooking(bookingNumber);
    }


}