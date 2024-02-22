package screenmatch.models;

public class Show extends Entertainment{
    private int seasons;
    private int episodesPerSeason;
    private boolean isCurrently;
    private int episodeRunningTime;

    @Override
    public String showOverview() {
        return """
                Título: %s
                Duração do Episódio: %d minutos
                Ano de Lançamento: %d
                """.formatted(title, episodeRunningTime, releaseYear);
    }

    public void setEpisodeRunningTime(int episodeRunningTime) {
        this.episodeRunningTime = episodeRunningTime;
    }
}