package com.meetingroom.Database;

import com.meetingroom.domainmodel.entities.Reservation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InMemoryDatabase {

    public static List<Reservation> reservations = new ArrayList<>();

    public static String create(Reservation newReservation) {

        reservations.add(newReservation);
        return newReservation.getReservationNumber();
    }

    public static Reservation getByReservationNumber(String reservationNumber) {
        List<Reservation> list = reservations.stream().filter((Reservation reserv) -> reserv.getReservationNumber().equalsIgnoreCase(reservationNumber)).collect(Collectors.toList());
        if(!list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    public static String delete(String reservationNumber) {
        Reservation reservation = getByReservationNumber(reservationNumber);
        if(reservation != null) {
            reservations.remove(reservation);
            return "Reservation: " + reservationNumber + "canceled sucessfully";
        }

        return "Reservation: " + reservationNumber + "is not a valid one";
    }
}
