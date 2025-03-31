import java.util.Date;


public class Show {
    private int showId;
    private Movie movie;
    private Theatre theatre;
    private Date showTime;
    private Seat[] seats;

    public Show(int theatreId, Movie movie, Theatre theatre, Date showTime, int totalSeats) {
        this.showId = showId;
        this.movie = movie;
        this.theatre = theatre;
        this.showTime = showTime;
        seats = new Seat[totalSeats];

        for (int i = 0; i < totalSeats; i++) {
            seats[i] = new Seat(i + 1);
        }

    }

    public Seat[] getSeats() {
        return seats;
    }

    public Movie getMovie() {
        return movie;
    }
}