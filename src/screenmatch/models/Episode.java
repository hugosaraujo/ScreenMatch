package screenmatch.models;

import screenmatch.runningtimecalculator.Rating;

public class Episode implements Rating {
    private int episodeNumber;
    private String mainTitle;
    private Show showName;
    private int totalVisualization;


    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public String getMainTitle() {
        return mainTitle;
    }

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    public Show getShowName() {
        return showName;
    }

    public void setShowName(Show showName) {
        this.showName = showName;
    }

    public int getTotalVisualization() {
        return totalVisualization;
    }

    public void setTotalVisualization(int totalVisualization) {
        this.totalVisualization = totalVisualization;
    }

    public int getRatingNote(){
        if(totalVisualization > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
