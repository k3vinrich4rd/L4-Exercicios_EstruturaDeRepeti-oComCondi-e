package l4;

import java.util.Scanner;
// valores nos intervalos entre números inteiros
public record Exercicio6() {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int primeiroNumeroInteiro = input.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int segundoNumeroInteiro = input.nextInt();
        input.close();

        int intervalo = 0;

        for (int i = primeiroNumeroInteiro +1; i < segundoNumeroInteiro; i++) {
            intervalo = i;
            System.out.print("Os números nos intervalos são: ");
            System.out.println(intervalo);
        }


    }
}
