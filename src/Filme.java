public class Filme {
    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    double avaliacao;
    int totalDeAvaliacao;

    void exibeFichaTecnica() {
        String fichaTecnica = """
                Titulo do Filme: %s
                Ano de Lançamento: %d
                Duração em Minutos: %d min
                """.formatted(nome, anoDeLancamento, duracaoEmMinutos);
        System.out.println(fichaTecnica);
    }

    void avalia(int nota) {
        avaliacao += nota;
        totalDeAvaliacao++;
    }

    double pegaMedia(){
        return avaliacao / totalDeAvaliacao;
    }
}
