package screenmatch.runningtimecalculator;

public class RecommentationFilter {
    public void toFilt(Rating rate){
        if(rate.getRatingNote() >= 4) {
            System.out.println("Está entre os preferidos da galera!");
        } else if (rate.getRatingNote() >= 2) {
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na lista para assistir");
        }
    }
}
