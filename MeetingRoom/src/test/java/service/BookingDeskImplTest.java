package service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import testdata.TestData;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.Assert.*;

public class BookingDeskImplTest {
    private BookingDeskImpl impl;
    @Before
    public void setUp() throws Exception {
        impl = new BookingDeskImpl();
    }

    @After
    public void tearDown() throws Exception {
        impl = null;
    }

    @Test
    public void checkAvailability() {
    }

    @Test
    public void makeBooking() {
        String bookingNumber = impl.makeBooking(TestData.createBookingTO());
        assertEquals("Suraj_1", bookingNumber);
    }

    @Test
    public void udpateBooking() {
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

    @Test
    public void deleteBooking() {
        String bookingNumber = "Suraj_1";
        impl.deleteBooking(bookingNumber);
    }

}