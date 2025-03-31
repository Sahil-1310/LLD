import java.util.List;

class Booking {
    private int bookingId;
    private User user;
    private Show show;
    private List<Seat> seats;
    private Payment payment;

    public Booking(int bookingId, User user, Show show, List<Seat> seats, Payment payment) {
        this.bookingId = bookingId;
        this.user = user;
        this.show = show;
        this.seats = seats;
        this.payment = payment;
    }

    public Show getShow() {
        return show;
    }
}
