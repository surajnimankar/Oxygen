package domainmodel.repositories;

import Database.InMemoryDatabase;
import domainmodel.Reservation;
import org.apache.commons.lang3.StringUtils;

public class ReservationRepository {

    public String makeReservation(Reservation reservation) {
        if(reservation == null) {
            return "Invalid Reservation Details";
        }
        else if(reservation.getGuest() == null || StringUtils.isEmpty(reservation.getGuest().getName()) ||
                StringUtils.isEmpty(reservation.getGuest().getContactNumber())) {
            return "Reservation without Guest Details not possible";
        }
        else if(reservation.getRoom() == null) {
            return "Reservation without Room not possible";
        }
        else if(reservation.getDuration() == null || reservation.getDuration().getStartTime() == null ||
                reservation.getDuration().getEndTime() == null || reservation.getDuration().getBookingDate() == null) {
            return "Reservation without Duration not possible";

        }
        return InMemoryDatabase.create(reservation);
    }

    public Reservation retrieveReservation(String reservationNumber) {
        return InMemoryDatabase.getByReservationNumber(reservationNumber);
    }

    public String changeReservation(Reservation reservation) {
        return null;
    }

    public String cancelReservation(String reservationNumber) {

        return InMemoryDatabase.delete(reservationNumber);
    }
}
