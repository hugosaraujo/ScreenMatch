package screenmatch.main;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import screenmatch.exceptions.YearSizeException;
import screenmatch.models.Entertainment;
import screenmatch.models.OmdbTitle;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner reader = new Scanner(System.in);
        String search = "";
        List<Entertainment> titles = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while(!search.equalsIgnoreCase("sair")) {

            System.out.print("Digite um filme para busca: ");
            search = reader.nextLine();

            if(search.equalsIgnoreCase("sair")){
                break;
            }

            String endereco = "http://www.omdbapi.com/?t=%s&apikey=51329da0".formatted(search.replace(" ", "+"));
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                OmdbTitle omdbTitle = gson.fromJson(json, OmdbTitle.class);
                System.out.println(omdbTitle);
                Entertainment title = new Entertainment(omdbTitle);

                System.out.println("Título convertido");
                System.out.println(title);

                titles.add(title);

            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());

            } catch (IllegalArgumentException e) {
                System.out.println("Parâmetro inválido, tente outra vez");
                System.out.println(e.getMessage());
            } catch (YearSizeException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Fechando o programa!");

        FileWriter writer = new FileWriter("filmes.json");
        writer.write(gson.toJson(titles));
        writer.close();
        
    }
}

