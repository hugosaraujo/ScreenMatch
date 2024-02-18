public class Filme {
    String titulo;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double notas;
    double quantidadeNotas;
    int duracaoEmMinutos;

    public void exibeFichaTecnica(){
        String fichaTecnica = """
                Título: %s
                Duração: %d minutos
                Ano de Lançamento: %d
                """.formatted(titulo, duracaoEmMinutos, anoDeLancamento);
        System.out.println(fichaTecnica);
    }

    void avalia(double nota){
        notas += nota;
        quantidadeNotas++;
    }

    double exibeMedia() {
        return notas / quantidadeNotas;
    }
}