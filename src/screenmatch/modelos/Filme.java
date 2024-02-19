package screenmatch.modelos;

public class Filme {
    private String titulo;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double notas;
    private int quantidadeNotas;
    private int duracaoEmMinutos;

    public String exibeFichaTecnica(){

        return """
                Título: %s
                Duração: %d minutos
                Ano de Lançamento: %d
                """.formatted(titulo, duracaoEmMinutos, anoDeLancamento);
    }

    public void avalia(double nota){
        notas += nota;
        quantidadeNotas++;
    }

    public double exibeMedia() {
        return notas / quantidadeNotas;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getQuantidadeNotas(){
        return quantidadeNotas;
    }
}