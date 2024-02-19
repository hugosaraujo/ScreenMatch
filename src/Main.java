import screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        //criar menu para interagir com as classes
        //utilizar os métodos específicos para cada opção de menu;

        Filme tmv = new Filme();

        tmv.setTitulo("Todos menos você");
        tmv.setAnoDeLancamento(2023);
        tmv.setDuracaoEmMinutos(103);

        tmv.avalia(5);
        tmv.avalia(10);
        tmv.avalia(6);

        System.out.println(tmv.getQuantidadeNotas());
        System.out.println(tmv.exibeMedia());
        System.out.println(tmv.exibeFichaTecnica());
    }
}