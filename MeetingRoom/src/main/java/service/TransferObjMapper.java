package service;

import business.BookingBO;
import business.BookingBOBuilder;

public class TransferObjMapper {

    public BookingBO toBusinessObject(BookingTO transferObject) {
        // validate transfer object
        // map transfer object to business object
        BookingBO businessObject = new BookingBOBuilder().withBookingDate(transferObject.getBookingDate())
                .withStartTime(transferObject.getStartTime())
                .withEndTime(transferObject.getEndTime())
                .withGuest(transferObject.getGuest())
                .withRoom(transferObject.getRoom())
                .build();

        return businessObject;

    }

    public BookingTO fromBusinessObject(BookingBO businessObject) {
        // map business object to transfer object
        BookingTO transferObject = new BookingTOBuilder().withBookingDate(businessObject.getBookingDate())
                .withStartTime(businessObject.getStartTime())
                .withEndTime(businessObject.getEndTime())
                .withGuest(businessObject.getGuest())
                .withRoom(businessObject.getRoom())
                .build();

        return transferObject;

    }
}
