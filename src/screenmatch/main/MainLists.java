package screenmatch.main;

import screenmatch.models.Entertainment;
import screenmatch.models.Film;
import screenmatch.models.Show;

import java.util.ArrayList;

public class MainLists {
    public static void main(String[] args) {


        Film aoby = new Film("Anyone but you", 2023, "Will Gluck");
        Show gilmoreGirls = new Show("Gilmore Girls");
        Show theBear = new Show("The Bear");
        Film americanFiction = new Film("American Fiction", 2024, "Cord Jefferson");
        var martian = new Film("The Martian", 2015, "Drew Goddard");
        Film tbah = new Film("The Boy and the Heron", 2023, "Hayao Miyazaki");

        ArrayList<Entertainment> list = new ArrayList<Entertainment>();
        list.add(aoby);
        list.add(americanFiction);
        list.add(martian);
        list.add(tbah);
        list.add(theBear);
        list.add(gilmoreGirls);

        for(var item: list){
            System.out.print(item);
            if (item instanceof Film filme) {
                System.out.printf("Dirigido por: %s\n", filme.getDirector());
            }
        }

    }
}
