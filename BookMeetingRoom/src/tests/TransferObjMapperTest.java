package tests;

import business.BookingBO;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.BookingTO;
import service.TransferObjMapper;

import static org.junit.jupiter.api.Assertions.*;

class TransferObjMapperTest {

    private TransferObjMapper mapper;
    @BeforeEach
    void setUp() {
        mapper = new TransferObjMapper();
    }

    @AfterEach
    void tearDown() {
        mapper = null;
    }

    @Test
    void toBusinessObject() {
        BookingTO transferObject = TestData.createBookingTO();
        BookingBO businessObject = mapper.toBusinessObject(transferObject);
        assertNotNull(businessObject);
        assertEquals(transferObject.getBookingDate(), businessObject.getBookingDate());
        assertEquals(transferObject.getStartTime(), businessObject.getStartTime());
        assertEquals(transferObject.getEndTime(), businessObject.getEndTime());
        assertEquals(transferObject.getGuest().getName(), businessObject.getGuest().getName());
        assertEquals(transferObject.getGuest().getContactNumber(), businessObject.getGuest().getContactNumber());
        assertEquals(transferObject.getRoom(), businessObject.getRoom());
    }

    @Test
    void fromBusinessObject() {
        BookingBO businessObject = TestData.createBookingBO();
        BookingTO transferObject = mapper.fromBusinessObject(businessObject);
        assertNotNull(businessObject);
        assertEquals(businessObject.getBookingDate(), transferObject.getBookingDate());
        assertEquals(businessObject.getStartTime(), transferObject.getStartTime());
        assertEquals(businessObject.getEndTime(), transferObject.getEndTime());
        assertEquals(businessObject.getGuest().getName(), transferObject.getGuest().getName());
        assertEquals(businessObject.getGuest().getContactNumber(), transferObject.getGuest().getContactNumber());
        assertEquals(businessObject.getRoom(), transferObject.getRoom());

    }

}