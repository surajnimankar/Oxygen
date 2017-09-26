package service;

import business.BookingBO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import testdata.TestData;

import static org.junit.Assert.*;

public class TransferObjMapperTest {

    private TransferObjMapper mapper;

    @Before
    public void setUp() throws Exception {
        mapper = new TransferObjMapper();
    }

    @After
    public void tearDown() throws Exception {
        mapper = null;
    }

    @Test
    public void toBusinessObject() {
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
   public void fromBusinessObject() {
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