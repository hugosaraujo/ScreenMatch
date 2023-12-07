package screenMatch.modelos;

public class Filme {
    public String titulo;
    public int anoDeLancamento;
    public int duracaoEmMinutos;
    private double avaliacao;
    private int totalDeAvaliacoes;

    public void exibeFichaTecnica(){
        String fichaTecnica = """
                Titulo do Filme: %s
                Ano de Lançamento: %d
                Duracao em Minutos: %d
                Total de Avaliações: %d
                """.formatted(titulo, anoDeLancamento, duracaoEmMinutos, totalDeAvaliacoes);
        System.out.println(fichaTecnica);
    }
    public void avalia(int nota){
        avaliacao += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return avaliacao / totalDeAvaliacoes;
    }
}
