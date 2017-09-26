package business;

import access.BookingDAO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import testdata.TestData;

import static org.junit.Assert.*;

public class BusinessObjMapperTest {
    private BusinessObjMapper mapper;

    @Before
    public void setUp() throws Exception {
        mapper = new BusinessObjMapper();
    }

    @After
    public void tearDown() throws Exception {
        mapper = null;
    }

    @Test
    public void toDAOObject() {
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
    public void fromDAOObject() {
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