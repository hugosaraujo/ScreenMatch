package screenmatch.models;

public class Show extends Entertainment{
    private int seasons;
    private int episodesPerSeason;
    private boolean isCurrently;
    private int episodeRunningTime;

    public Show(String title) {
        super(title);
    }
    public void setEpisodeRunningTime(int episodeRunningTime) {
        this.episodeRunningTime = episodeRunningTime;
    }

    @Override
    public String toString() {
        return """
               Série: %s (%d)
               """.formatted(super.getTitle(), releaseYear);
    }
}