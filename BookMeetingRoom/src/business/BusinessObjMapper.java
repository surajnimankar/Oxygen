package business;

import access.BookingDAO;
import access.BookingDAOBuilder;

public class BusinessObjMapper {

    public BookingDAO toDAOObject(BookingBO businessObject) {
        BookingDAO daoObject = new BookingDAOBuilder().withBookingDate(businessObject.getBookingDate())
                .withstartTime(businessObject.getStartTime())
                .withEndTime(businessObject.getEndTime())
                .withGuest(businessObject.getGuest())
                .withRoom(businessObject.getRoom())
                .build();

        return daoObject;
    }

    public BookingBO fromDAOObject(BookingDAO daoObject) {

        BookingBO businessObject = new BookingBOBuilder().withBookingDate(daoObject.getBookingDate())
                .withStartTime(daoObject.getStartTime())
                .withEndTime(daoObject.getEndTime())
                .withGuest(daoObject.getGuest())
                .withRoom(daoObject.getRoom())
                .build();

        return businessObject;
    }
}
