package l4;

import java.util.Scanner;
// valores nos intervalos entre n�meros inteiros
public record Exercicio6() {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro n�mero inteiro: ");
        int primeiroNumeroInteiro = input.nextInt();
        System.out.print("Digite o segundo n�mero inteiro: ");
        int segundoNumeroInteiro = input.nextInt();
        input.close();

        int intervalo = 0;

        for (int i = primeiroNumeroInteiro +1; i < segundoNumeroInteiro; i++) {
            intervalo = i;
            System.out.print("Os n�meros nos intervalos s�o: ");
            System.out.println(intervalo);
        }


    }
}
