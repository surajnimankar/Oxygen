package domainmodel;

import domainmodel.factories.ReservationBuilder;

public class Reservation {
    private String reservationNumber;
    private Guest guest;
    private Room room;
    private Duration duration;
    private Status status;

    private Reservation() {

    }

    public Reservation(ReservationBuilder builder) {
        this.reservationNumber = builder.reservationNumber;
        this.guest = builder.guest;
        this.room = builder.room;
        this.duration = builder.duration;
        this.status = builder.status;
    }

    public String getReservationNumber() {
        return reservationNumber;
    }

    public Guest getGuest() {
        return guest;
    }

    public Room getRoom() {
        return room;
    }

    public Duration getDuration() {
        return duration;
    }

    public Status getStatus() {
        return status;
    }

    public String toString() {
        return ("Reservation :[ reservationNumber : " + reservationNumber + ", guest : " + guest
                + ", room : " + room + ", duration : " + duration + ", status : " + status + " ]");
    }
}
