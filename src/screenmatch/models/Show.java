package screenmatch.models;

public class Show extends Entertainment{
    private int episodeRunningTime;

    @Override
    public String showOverview() {
        return """
                Título: %s
                Duração do Episódio: %d minutos
                Ano de Lançamento: %d
                """.formatted(super.getTitle(), episodeRunningTime, super.getReleaseYear());
    }

    public void setEpisodeRunningTime(int episodeRunningTime) {
        this.episodeRunningTime = episodeRunningTime;
    }
}