import java.util.*;

public class BookMyShow {
    public static void main(String[] args) {
        // Create Users
        User user1 = new User(1, "Alice");

        // Create Movies & Theatres
        Movie movie1 = new Movie(101, "Avengers", "Action");
        Theatre theatre1 = new Theatre(201, "PVR Cinemas", "NYC");

        // Create Show
        Show show1 = new Show(301, movie1, theatre1, new Date(), 5);
        theatre1.addShow(show1);

        // Select Seats
        List<Seat> selectedSeats = Arrays.asList(show1.getSeats()[0], show1.getSeats()[1]);

        // Process Payment
        Payment payment = PaymentFactory.getPaymentMethod("CreditCard", 500);

        // Book Tickets
        BookingService bookingService = BookingService.getInstance();
        Booking booking = bookingService.bookSeats(user1, show1, selectedSeats, payment);

        // Observer Pattern (Notification)
        UserObserver userObserver = new UserObserver(user1.getName());
        if (booking != null) {
            userObserver.notifyUser("Your booking for " + booking.getShow().getMovie().getTitle() + " is confirmed!");
        }
    }
}
