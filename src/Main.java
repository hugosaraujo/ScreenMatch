import screenMatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Screen Match");

        Filme creed3 = new Filme();
        creed3.setTitulo("Creed III");
        creed3.setAnoDeLancamento(2023);
        creed3.setDuracaoEmMinutos(161);

        creed3.exibeFichaTecnica();

        creed3.avalia(6);
        creed3.avalia(8);
        creed3.avalia(10);

        double media = creed3.pegaMedia();
        System.out.printf("%.1f".formatted(media));
    }
}