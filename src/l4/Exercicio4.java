package l4;
// comparador numeral
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Comparador numeral\n");
        System.out.print("Digite o primeiro n�mero: ");
        double numero1 = input.nextDouble();
        System.out.print("Digite o segundo n�mero: ");
        double numero2 = input.nextDouble();
        System.out.print("Digite o terceiro n�mero: ");
        double numero3 = input.nextDouble();
        System.out.print("Digite o quarto n�mero: ");
        double numero4 = input.nextDouble();
        System.out.print("Digite o quinto n�mero: ");
        double numero5 = input.nextDouble();
        input.close();

        if (numero1 > numero2 && numero1 > numero3 && numero1 > numero4 && numero1 > numero5) {
            System.out.println("O Primeiro n�mero digitado que foi o " + numero1 + ", � maior que os demais n�meros");

        } else if (numero2 > numero1 && numero2 > numero3 && numero2 > numero4 && numero2 > numero5) {
            System.out.println("O Segundo n�mero digitado que foi o " + numero2 + ", � maior que os demais n�meros");

        }else if (numero3 > numero1 && numero3 > numero2 && numero3 > numero4 && numero3 > numero5){
            System.out.println("O Terceiro n�mero digitado que foi o " + numero3 + ", � maior que os demais n�meros");

        } else if (numero4 > numero1 && numero4 > numero2 && numero4 > numero3 && numero4 > numero5) {
            System.out.println("O Quarto n�mero digitado que foi o " + numero4 + ", � maior que os demais n�meros");

        } else if (numero5 > numero1 && numero5 > numero2 && numero5 > numero3 && numero5 > numero4) {
            System.out.println("O Quinto n�mero digitado que foi o " + numero5 + ", � maior que os demais n�meros");

        } else if (numero1 == numero2 || numero1 == numero3 || numero1 == numero4 || numero1 == numero5) {
            System.out.println("Nem maior e nem menor, os n�meros s�o iguais.");

        }


    }

}
