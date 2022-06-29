package l4;
// comparador numeral
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Comparador numeral\n");
        System.out.print("Digite o primeiro número: ");
        double numero1 = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = input.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double numero3 = input.nextDouble();
        System.out.print("Digite o quarto número: ");
        double numero4 = input.nextDouble();
        System.out.print("Digite o quinto número: ");
        double numero5 = input.nextDouble();
        input.close();

        if (numero1 > numero2 && numero1 > numero3 && numero1 > numero4 && numero1 > numero5) {
            System.out.println("O Primeiro número digitado que foi o " + numero1 + ", é maior que os demais números");

        } else if (numero2 > numero1 && numero2 > numero3 && numero2 > numero4 && numero2 > numero5) {
            System.out.println("O Segundo número digitado que foi o " + numero2 + ", é maior que os demais números");

        }else if (numero3 > numero1 && numero3 > numero2 && numero3 > numero4 && numero3 > numero5){
            System.out.println("O Terceiro número digitado que foi o " + numero3 + ", é maior que os demais números");

        } else if (numero4 > numero1 && numero4 > numero2 && numero4 > numero3 && numero4 > numero5) {
            System.out.println("O Quarto número digitado que foi o " + numero4 + ", é maior que os demais números");

        } else if (numero5 > numero1 && numero5 > numero2 && numero5 > numero3 && numero5 > numero4) {
            System.out.println("O Quinto número digitado que foi o " + numero5 + ", é maior que os demais números");

        } else if (numero1 == numero2 || numero1 == numero3 || numero1 == numero4 || numero1 == numero5) {
            System.out.println("Nem maior e nem menor, os números são iguais.");

        }


    }

}
