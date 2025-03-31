class Movie {
    private int movieId;
    private String title;
    private String genre;

    public Movie(int movieId, String title, String genre) {
        this.movieId = movieId;
        this.title = title;
        this.genre = genre;
    }
    public String getTitle() {
        return title;
    }
}