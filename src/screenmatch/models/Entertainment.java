package screenmatch.models;

public class Entertainment implements Comparable<Entertainment>{

    private String title;
    protected int releaseYear;
    private boolean plainIncluded;
    private double rates;
    private int totalRating;
    private int runningTimeinMinutes;


    public Entertainment(String title) {
        this.title = title;
    }

    public String showOverview(){
        return """
                Título: %s
                Duração: %d minutos
                Ano de Lançamento: %d
                """.formatted(title, runningTimeinMinutes, releaseYear);
    }
    public String getTitle(){
        return title;
    }

    public int getReleaseYear(){
        return releaseYear;
    }

    public void rate(double rate){
        rates += rate;
        totalRating++;
    }

    public double showAverage() {
        return rates / totalRating;
    }

    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }

    public int getRunningTimeInMinutes(){
        return runningTimeinMinutes;
    }
    public void setRunningTimeinMinutes(int runningTimeinMinutes){
        this.runningTimeinMinutes = runningTimeinMinutes;
    }

    public int getTotalRating(){
        return totalRating;
    }

    @Override
    public int compareTo(Entertainment otherTitle) {
        return this.getTitle().compareTo(otherTitle.getTitle());
    }
}
