package com.meetingroom.services;

import com.meetingroom.domainmodel.entities.Reservation;
import com.meetingroom.domainmodel.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository repository;

    public Collection<Reservation> getAllReservations() {
        return repository.getAllReservations();
    }

    public Reservation getReservationByNumber(String reservationNumber) {
        return repository.getReservationByNumber(reservationNumber);
    }

    public void cancelReservationByNumber(String reservationNumber) {
        repository.cancelReservation(reservationNumber);
    }

    public void updateReservation(Reservation reservation) {
        repository.updateReservation(reservation);
    }

    public void createReservation(Reservation reservation) {
        repository.createReservation(reservation);
    }
}
