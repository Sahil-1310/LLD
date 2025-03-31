import java.util.List;
import java.util.ArrayList;

class Theatre {
    private int theatreId;
    private String name;
    private String location;
    private List<Show> shows;

    public Theatre(int theatreId, String name, String location) {
        this.theatreId = theatreId;
        this.name = name;
        this.location = location;
        this.shows = new ArrayList<>();
    }

    public void addShow(Show show) {
        shows.add(show);
    }
}