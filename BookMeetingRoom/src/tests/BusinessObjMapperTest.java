package tests;

import access.BookingDAO;
import business.BookingBO;
import business.BusinessObjMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusinessObjMapperTest {
    private BusinessObjMapper mapper;
    @BeforeEach
    void setUp() {
        mapper = new BusinessObjMapper();
    }

    @AfterEach
    void tearDown() {
        mapper = null;
    }

    @Test
    void toDAOObject() {
        BookingBO businessObject = TestData.createBookingBO();
        BookingDAO daoObject = mapper.toDAOObject(businessObject);
        assertNotNull(daoObject);
        assertEquals(businessObject.getBookingDate(), daoObject.getBookingDate());
        assertEquals(businessObject.getStartTime(), daoObject.getStartTime());
        assertEquals(businessObject.getEndTime(), daoObject.getEndTime());
        assertEquals(businessObject.getGuest().getName(), daoObject.getGuest().getName());
        assertEquals(businessObject.getGuest().getContactNumber(), daoObject.getGuest().getContactNumber());
        assertEquals(businessObject.getRoom(), daoObject.getRoom());
    }

    @Test
    void fromDAOObject() {
        BookingDAO daoObject = TestData.createBookingDAO();
        BookingBO businessObject = mapper.fromDAOObject(daoObject);
        assertNotNull(daoObject);
        assertEquals(daoObject.getBookingDate(), businessObject.getBookingDate());
        assertEquals(daoObject.getStartTime(), businessObject.getStartTime());
        assertEquals(daoObject.getEndTime(), businessObject.getEndTime());
        assertEquals(daoObject.getGuest().getName(), businessObject.getGuest().getName());
        assertEquals(daoObject.getGuest().getContactNumber(), businessObject.getGuest().getContactNumber());
        assertEquals(daoObject.getRoom(), businessObject.getRoom());
    }

}