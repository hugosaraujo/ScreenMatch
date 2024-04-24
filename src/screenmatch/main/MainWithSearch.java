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
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner reader = new Scanner(System.in);

        System.out.print("Digite um filme para busca: ");
        var searcher = reader.nextLine();

        String endereco = "http://www.omdbapi.com/?t=%s&apikey=51329da0".formatted(searcher.replace(" ", "+"));
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).
                    create();

            OmdbTitle omdbTitle = gson.fromJson(json, OmdbTitle.class);
            System.out.println(omdbTitle);
            Entertainment title = new Entertainment(omdbTitle);

        //try{
            System.out.println("Título convertido");
            System.out.println(title);

            FileWriter writer = new FileWriter("filmes.txt");
            writer.write(title.toString());
            writer.close();

        } catch (NumberFormatException e ) {
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e){
            System.out.println("Parâmetro inválido, tente outra vez");
            System.out.println(e.getMessage());
        } catch (YearSizeException e){
            System.out.println(e.getMessage());
        }
    }
}

