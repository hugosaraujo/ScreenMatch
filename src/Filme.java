public class Filme {
    String titulo;
    int anoDeLancamento;
    int duracaoEmMinutos;
    double avaliacao;
    int totalDeAvaliacoes;

    void exibeFichaTecnica(){
        String fichaTecnica = """
                Titulo do Filme: %s
                Ano de Lançamento: %d
                Duracao em Minutos: %d
                Total de Avaliações: %d
                """.formatted(titulo, anoDeLancamento, duracaoEmMinutos, totalDeAvaliacoes);
        System.out.println(fichaTecnica);
    }
    void avalia(int nota){
        avaliacao += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia() {
        return avaliacao / totalDeAvaliacoes;
    }
}
