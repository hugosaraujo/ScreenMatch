package screenMatch.modelos;

public class Filme {
    private String titulo;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private double avaliacao;
    private int totalDeAvaliacoes;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

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
