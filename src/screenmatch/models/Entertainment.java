package screenmatch.models;

public class Entertainment {
    private String title;
    private int releaseYear;
    private boolean plainIncluded;
    private double rates;
    private int totalRating;
    private int runningTimeinMinutes;

    public String showOverview(){
        return """
                Título: %s
                Duração: %d minutos
                Ano de Lançamento: %d
                """.formatted(title, runningTimeinMinutes, releaseYear);
    }

    public void rate(double rate){
        rates += rate;
        totalRating++;
    }

    public double showAverage() {
        return rates / totalRating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }

    public void setRunningTimeinMinutes(int runningTimeinMinutes){
        this.runningTimeinMinutes = runningTimeinMinutes;
    }

    public int getTotalRating(){
        return totalRating;
    }
}
