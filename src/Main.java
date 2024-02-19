import screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        //criar menu para interagir com as classes
        //utilizar os métodos específicos para cada opção de menu;

        Filme tmv = new Filme();

        tmv.titulo = "Todos menos você";
        tmv.anoDeLancamento = 2023;
        tmv.duracaoEmMinutos = 103;

        tmv.avalia(5);
        tmv.avalia(10);
        tmv.avalia(6);
        System.out.println(tmv.exibeMedia());
        //tmv.exibeFichaTecnica();
    }
}