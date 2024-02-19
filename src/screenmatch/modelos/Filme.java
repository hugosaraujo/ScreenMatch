package screenmatch.modelos;

public class Filme {
    public String titulo;
    public int anoDeLancamento;
    public boolean incluidoNoPlano;
    private double notas;
    private double quantidadeNotas;
    public int duracaoEmMinutos;

    public void exibeFichaTecnica(){
        String fichaTecnica = """
                Título: %s
                Duração: %d minutos
                Ano de Lançamento: %d
                """.formatted(titulo, duracaoEmMinutos, anoDeLancamento);
        System.out.println(fichaTecnica);
    }

    public void avalia(double nota){
        notas += nota;
        quantidadeNotas++;
    }

    public double exibeMedia() {
        return notas / quantidadeNotas;
    }
}