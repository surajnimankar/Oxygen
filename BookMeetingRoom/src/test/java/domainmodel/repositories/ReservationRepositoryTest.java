package domainmodel.repositories;

import Database.InMemoryDatabase;
import TestData.TestDataFactory;
import domainmodel.Guest;
import domainmodel.Reservation;
import domainmodel.factories.ReservationBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReservationRepositoryTest {
    private ReservationRepository repository;
    @Before
    public void setUp() throws Exception {
        repository = new ReservationRepository();
    }

    @After
    public void tearDown() throws Exception {
        repository = null;
    }

    @Test
    public void makeReservation() throws Exception {
        Reservation reservation = TestDataFactory.createReservation();
        String reservationNumber = repository.makeReservation(reservation);
        assertEquals(1, InMemoryDatabase.reservations.size());
        assertNotNull(InMemoryDatabase.reservations.get(0));
        assertEquals(reservationNumber, InMemoryDatabase.reservations.get(0).getReservationNumber());
    }

    @Test
    public void make_Reservation_Without_Guest_Details() {
        Reservation reservation = TestDataFactory.createReservation();
        Reservation reservationWithoutGuest = ReservationBuilder.getInstance()
                .fromExistingReservation(reservation).withGuest(null)
                .build();

        String reservationNumber = repository.makeReservation(reservationWithoutGuest);
        assertEquals("Reservation without Guest Details not possible", reservationNumber);
   }

   @Test
    public void make_Reservation_Without_Guest_Name() {
        Reservation reservation = TestDataFactory.createReservation();
        Guest guest = new Guest(null, "12345");
        Reservation reservationWithoutGuest = ReservationBuilder.getInstance()
                .fromExistingReservation(reservation).withGuest(guest)
                .build();

        String reservationNumber = repository.makeReservation(reservationWithoutGuest);
        assertEquals("Reservation without Guest Details not possible", reservationNumber);
    }

    @Test
    public void make_Reservation_Without_Guest_Contact() {
        Reservation reservation = TestDataFactory.createReservation();
        Guest guest = new Guest("", null);
        Reservation reservationWithoutGuest = ReservationBuilder.getInstance()
                .fromExistingReservation(reservation).withGuest(guest)
                .build();

        String reservationNumber = repository.makeReservation(reservationWithoutGuest);
        assertEquals("Reservation without Guest Details not possible", reservationNumber);
    }

    @Test
    public void make_Reservation_Without_Room() {
        Reservation reservation = TestDataFactory.createReservation();
        Reservation reservationWithoutGuest = ReservationBuilder.getInstance()
                .fromExistingReservation(reservation).withRoom(null)
                .build();

        String reservationNumber = repository.makeReservation(reservationWithoutGuest);
        assertEquals("Reservation without Room not possible", reservationNumber);
    }

    @Test
    public void make_Reservation_Without_Duration() {
        Reservation reservation = TestDataFactory.createReservation();
        Reservation reservationWithoutGuest = ReservationBuilder.getInstance()
                .fromExistingReservation(reservation).withDuration(null)
                .build();

        String reservationNumber = repository.makeReservation(reservationWithoutGuest);
        assertEquals("Reservation without Duration not possible", reservationNumber);
    }


    @Test
    public void retrieveReservation() throws Exception {
        repository.makeReservation(TestDataFactory.createReservation());
        Reservation reservation = repository.retrieveReservation("Suraj_1");
        assertNotNull(InMemoryDatabase.reservations.get(0));
    }

    @Test
    public void changeReservation() throws Exception {
    }

    @Test
    public void cancelReservation() throws Exception {
    }

}