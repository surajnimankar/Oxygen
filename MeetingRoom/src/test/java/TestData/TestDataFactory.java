package TestData;

import com.meetingroom.domainmodel.entities.Reservation;
import com.meetingroom.domainmodel.factories.ReservationBuilder;
import com.meetingroom.domainmodel.valueobject.Duration;
import com.meetingroom.domainmodel.valueobject.Guest;
import com.meetingroom.domainmodel.valueobject.Room;
import com.meetingroom.domainmodel.valueobject.Status;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TestDataFactory {

    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
    static LocalDate bookingDate = LocalDate.parse("30/09/2017", formatter);
    static LocalTime startTime = LocalTime.parse("09:00");
    static LocalTime endTime = LocalTime.parse("12:00");

    public static Reservation createReservation() {
        Reservation reservation = ReservationBuilder.getInstance()
                .withReservationNumber("Suraj_1")
                .withDuration(createDuration())
                .withGuest(createGuest())
                .withRoom(Room.ROOM_LARGE)
                .withStatus(Status.STATUS_BOOKED)
                .build();

        return reservation;
    }

    private static Guest createGuest() {
       return new Guest("Suraj", "12345");
    }

    private static Duration createDuration() {
        return new Duration(bookingDate, startTime, endTime);
    }
}
