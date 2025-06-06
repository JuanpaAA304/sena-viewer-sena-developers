package model;

public class Movie extends Film {
    private int timeViewed;

    public Movie(String title, String genre, String creator, int duration, int year) {
        super(title, genre, creator, duration);
        this.setYear(year);
        this.setViewed(false);
        this.timeViewed = 0;
    }

    // Getters y Setters
    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    @Override
    public String toString() {
        return "Película: " + getTitle() +
               " | Director: " + getCreator() +
               " | Año: " + getYear() +
               " | Duración: " + getDuration() + " min" +
               " | Visto: " + isViewed() +
               " | Tiempo visto: " + timeViewed + " min";
    }
}
