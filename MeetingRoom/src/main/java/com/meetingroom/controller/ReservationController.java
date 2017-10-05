package com.meetingroom.controller;

import com.meetingroom.domainmodel.entities.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.meetingroom.services.ReservationService;

import java.util.Collection;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    @Autowired
    private ReservationService service;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Reservation> getAllReservations() {
        return service.getAllReservations();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Reservation getReservationByNumber(@PathVariable("id") String reservationNumber) {
        return service.getReservationByNumber(reservationNumber);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void cancelReservationByNumber(@PathVariable("id") String reservationNumber) {
        service.cancelReservationByNumber(reservationNumber);
    }
}
