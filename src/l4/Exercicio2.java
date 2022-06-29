package l4;
// Informando os dias da semana
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = input.nextInt();
        input.close();

        switch (numero) {
            case 1 -> System.out.print("Domingo");
            case 2 -> System.out.print("Segunda");
            case 3 -> System.out.print("Terça");
            case 4 -> System.out.print("Quarta");
            case 5 -> System.out.print("Quinta");
            case 6 -> System.out.print("Sexta");
            case 7 -> System.out.print("Sábado");
            default -> System.out.print("Valor inválido.");

        }
    }
}
