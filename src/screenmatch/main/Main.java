package screenmatch.main;

import screenmatch.models.Episode;
import screenmatch.models.Film;
import screenmatch.models.Show;
import screenmatch.runningtimecalculator.Calculator;
import screenmatch.runningtimecalculator.RecommentationFilter;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        /*
            1. Criar menu para interagir com o usuário
            2. Utilizar métodos específicos para cada opção de menu;
            3. criar um método para calcular o tempo necessário para maratonar uma série;
                3.1 mostrar por horas ou menus;
         */

        Film aoby = new Film("Anyone but you", 2023, "Will Gluck");

        aoby.setRuntimeInMinutes(103);

        aoby.rate(5);
        aoby.rate(10);
        aoby.rate(6);

        System.out.println(aoby.getTotalRating());
        System.out.println(aoby.showAverage());
        System.out.println(aoby);

        Show gilmoreGirls = new Show("Gilmore Girls");
        gilmoreGirls.setReleaseYear(2000);
        gilmoreGirls.setEpisodeRunningTime(45);
        gilmoreGirls.setRuntimeInMinutes(((45 * 21) * 7));

        Show theBear = new Show("The Bear");
        theBear.setReleaseYear(2022);
        theBear.setEpisodeRunningTime(30);

        System.out.println(gilmoreGirls);

        Calculator paraMaratonar = new Calculator();
        //paraMaratonar.add(gilmoreGirls);
        //System.out.println(paraMaratonar.getTotalRunningTime());
        paraMaratonar.add(aoby);
        System.out.println(paraMaratonar.getTotalRunningTime());

        Episode favourite = new Episode();
        favourite.setEpisodeNumber(0);
        favourite.setMainTitle("Hands");
        favourite.setShowName(theBear);
        favourite.setTotalVisualization(400);

        RecommentationFilter filter = new RecommentationFilter();
        filter.toFilt(aoby);

        Film americanFiction = new Film("American Fiction", 2024, "Cord Jefferson");

        var martian = new Film("The Martian", 2015, "Drew Goddard");

        Film tbah = new Film("The Boy and the Heron", 2023, "Hayao Miyazaki");

        ArrayList<Film> films = new ArrayList<>();
        films.add(aoby);
        films.add(americanFiction);
        films.add(martian);
        films.add(tbah);
        System.out.println(films);
        System.out.println(americanFiction);
        System.out.println(films.size());

        Collections.sort(films);
        System.out.println(films);
    }
}