import java.util.Date;
import java.util.List;

class BookingService {
    private static BookingService instance;

    private BookingService() {}  // Private constructor

    public static BookingService getInstance() {
        if (instance == null) {
            instance = new BookingService();
        }
        return instance;
    }

    public Booking bookSeats(User user, Show show, List<Seat> seats, Payment payment) {
        for (Seat seat : seats) {
            if (!seat.bookSeat()) {
                System.out.println("Seat already booked!");
                return null;
            }
        }
        payment.processPayment();
        Booking booking = new Booking(user.hashCode(), user, show, seats, payment);
        user.addBooking(booking);
        System.out.println("Booking successful for " + user.getName() + " for movie: " + show.getMovie().getTitle());
        return booking;
    }
}
