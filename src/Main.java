import screenmatch.models.Episode;
import screenmatch.models.Film;
import screenmatch.models.Show;
import screenmatch.runningtimecalculator.Calculator;
import screenmatch.runningtimecalculator.RecommentationFilter;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        //criar menu para interagir com as classes
        //utilizar os métodos específicos para cada opção de menu;
        //criar um método para calcular o tempo necessário para maratonar uma série
            //mostrar por horas ou minutos

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
        gilmoreGirls.setRunningTimeinMinutes(((45 * 21) * 7));

        Show theBear = new Show();
        gilmoreGirls.setTitle("The Bear");
        theBear.setReleaseYear(2022);
        theBear.setEpisodeRunningTime(30);

        System.out.println(gilmoreGirls.showOverview());

        Calculator paraMaratonar = new Calculator();
        //paraMaratonar.add(gilmoreGirls);
        //System.out.println(paraMaratonar.getTotalRunningTime());
        paraMaratonar.add(aoby);
        System.out.println(paraMaratonar.getTotalRunningTime());

        Episode favorite = new Episode();
        favorite.setEpisodeNumber(0);
        favorite.setMainTitle("Hands");
        favorite.setShowName(theBear);
        favorite.setTotalVisualization(400);

        RecommentationFilter filter = new RecommentationFilter();
        filter.toFilt(aoby);

        Film americanFiction = new Film();
        americanFiction.setTitle("American Fiction");
        americanFiction.setReleaseYear(2024);
        americanFiction.setDirector("Cord Jefferson");

        var martian = new Film();
        martian.setTitle("The Martian");
        martian.setReleaseYear(2015);
        martian.setDirector("Drew Goddard");

        Film tbah = new Film();
        tbah.setTitle("The Boy and the Heron");
        tbah.setDirector("Hayao Miyazaki");
        tbah.setReleaseYear(2023);

        ArrayList<Film> films = new ArrayList();
        films.add(aoby);
        films.add(americanFiction);
        films.add(martian);
        films.add(tbah);
        System.out.println(films.toString());
        System.out.println(americanFiction.toString());
        System.out.println(films.size());
    }
}