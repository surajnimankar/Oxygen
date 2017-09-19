package service;

import business.BookingInfoBO;
import business.BookingInfoBOBuilder;

public class TransferObjectMapper {

    public BookingInfoBO toBusinessObject(BookingInfoTO transferObject) {
        // validate transfer object
        // map transfer object to business object
        BookingInfoBO businessObject = new BookingInfoBOBuilder().withBookingDate(transferObject.getBookingDate())
                .withStartTime(transferObject.getStartTime())
                .withEndTime(transferObject.getEndTime()).build();

        return businessObject;

    }

    public BookingInfoTO fromBusinessObject(BookingInfoBO businessObject) {
        // map business object to transfer object
        BookingInfoTO transferObject = new BookingInfoTOBuilder().withBookingDate(businessObject.getBookingDate())
                .withStartTime(businessObject.getStartTime())
                .withEndTime(businessObject.getEndTime()).build();

        return transferObject;

    }
}
