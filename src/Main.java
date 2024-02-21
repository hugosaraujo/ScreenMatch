import screenmatch.models.Film;
import screenmatch.models.Show;


public class Main {
    public static void main(String[] args) {
        //criar menu para interagir com as classes
        //utilizar os métodos específicos para cada opção de menu;

        Film aoby = new Film();

        aoby.setTitle("Anyone but you");
        aoby.setReleaseYear(2023);
        aoby.setRunningTimeinMinutes(103);

        aoby.rate(5);
        aoby.rate(10);
        aoby.rate(6);

        System.out.println(aoby.getTotalRating());
        System.out.println(aoby.showAverage());
        System.out.println(aoby.showOverview());

        Show gilmoreGirls = new Show();
        gilmoreGirls.setTitle("Gilmore Girls");
        gilmoreGirls.setReleaseYear(2000);
        gilmoreGirls.setEpisodeRunningTime(45);

        System.out.println(gilmoreGirls.showOverview());
    }
}