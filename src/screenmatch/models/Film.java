package screenmatch.models;

import screenmatch.runningtimecalculator.Rating;

public class Film extends Entertainment implements Rating {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getRatingNote() {
        return (int)showAverage() / 2;
    }

    @Override
    public String toString() {
        return """
                Título: %s(%d)
                """.formatted(title, releaseYear);
    }
}