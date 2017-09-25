package clinet;

import business.Guest;
import business.Room;
import com.sun.org.apache.xpath.internal.SourceTree;
import service.BookingDesk;
import service.BookingDeskImpl;
import service.BookingTO;
import service.BookingTOBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class BookMeetingRoomClient {

    private static BookingDesk  desk = new BookingDeskImpl();

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            boolean quit = false;
            while(!quit) {
                displayMenu();
                String input = readInput(reader);
                if(input.trim().equalsIgnoreCase("quit")) {
                    quit = true;
                    System.out.println("You have exited sucessfully.. Good Bye..!");
                }
                else {
                    try {
                        int menu = Integer.parseInt(input);

                        switch (menu) {
                            case 1:
                                getAllRooms();
                                break;
                            case 2:
                                makeBooking(reader);
                                break;
                            case 3:
                                updateBooking(reader);
                                break;
                            case 4:
                                cancelBooking(reader);
                                break;
                        }
                    }catch(NumberFormatException exception) {
                        System.out.println();
                        System.out.println("*****************************");
                        System.out.println(input + " : is not a valid Input..");
                        System.out.println("Please enter a valid Input ->>");
                        System.out.println("*****************************");
                        continue;

                    }
                }
            }

        }catch(IOException exception) {
                exception.printStackTrace();
        }
    }

    private static void cancelBooking(BufferedReader reader) throws IOException {
        System.out.println();
        System.out.println("Booking reference number: ");
        String bookingNumber = readInput(reader);
        desk.deleteBooking(bookingNumber);
        System.out.println("Booking canceled sucessfully");
    }

    private static void updateBooking(BufferedReader reader) throws IOException {

        System.out.println();
        System.out.println("Booking reference number: ");
        String bookingNumber = readInput(reader);
        BookingTO information = getBookingInfo(reader);
        desk.updateBooking(bookingNumber, information);
        System.out.println("Booking Updated sucessfully");

    }

    private static void makeBooking(BufferedReader reader) throws IOException {

        BookingTO information = getBookingInfo(reader);
        String bookingNumber = desk.makeBooking(information);
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Booking done. Booking Number: " + bookingNumber);
        System.out.println("**************************************************");
        System.out.println();

    }

    public static void getAllBookingsOfTheDay() {

    }

    private static BookingTO getBookingInfo(BufferedReader reader) throws IOException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        System.out.println("Booking Date (DD/MM/YYYY): ");
        LocalDate bookingDate = LocalDate.parse(readInput(reader), formatter);
        System.out.println("Start Time (HH:MM): ");
        LocalTime startTime = LocalTime.parse(readInput(reader));
        System.out.println("End time (HH:MM): ");
        LocalTime endTime = LocalTime.parse(readInput(reader));

        System.out.println("Guest name: ");
        String guestName = readInput(reader);
        System.out.println("Contact number: ");
        String contactNumber = readInput(reader);

        System.out.println("Room number: ");
        int roomNumber = Integer.parseInt(readInput(reader));
        Room room = Room.getByRoomNumber(roomNumber);


        BookingTO information = new BookingTOBuilder().withBookingDate(bookingDate)
                .withStartTime(startTime)
                .withEndTime(endTime)
                .withGuest(new Guest(guestName, contactNumber))
                .withRoom(room)
                .build();

        return information;
    }

    private static String readInput(BufferedReader reader) throws IOException {
        System.out.println("Input: ");
        return reader.readLine();
    }

    private static void displayMenu() {
        System.out.println();
        System.out.println("Welcome to Book Meeting Room Applicaiton..!");
        System.out.println("PLEASE TYPE 'quit' TO QUIT");
        System.out.println("Menu Options: ");
        System.out.println("1. Display Rooms");
        System.out.println("2. Make booking");
        System.out.println("3. Update booking");
        System.out.println("4. Cancel booking");

    }

    public static void getAllRooms() {
        for(Room room : Room.values()) {
            System.out.println(room);
        }
    }
}
