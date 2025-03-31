import java.util.List;
import java.util.ArrayList;

class User {
    private int userId;
    private String name;
    private List<Booking> bookings;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        this.bookings = new ArrayList<>();
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public String getName() {
        return name;
    }
}
