package l4;

import java.util.Scanner;
// Outra forma de se fazer a tabuada utilizando o (fori):

public class Exercicio3Pt2fori {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual número você deseja ver a tabuada: ");
        int numero = input.nextInt();

        int x = numero;
        int y = 0;

        for ( x = 1; x <= 10; x++) {
            y = x * numero;
            System.out.println(numero + " x " + x + " = " + x);

        }
    }
}