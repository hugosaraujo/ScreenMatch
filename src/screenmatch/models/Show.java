package screenmatch.models;

public class Show extends Entertainment{
    private int seasons;
    private int episodesPerSeason;
    private boolean isCurrently;
    private int episodeRunningTime;

    public Show(String title) {
        super(title);
    }

    @Override
    public String toString() {
        return """
                Título: %s
                """.formatted(title);
    }

    public void setEpisodeRunningTime(int episodeRunningTime) {
        this.episodeRunningTime = episodeRunningTime;
    }
}