public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Screen Match");

        Filme creed3 = new Filme();
        creed3.nome = "Creed III";
        creed3.anoDeLancamento = 2023;
        creed3.duracaoEmMinutos = 161;

        creed3.exibeFichaTecnica();
    }
}
