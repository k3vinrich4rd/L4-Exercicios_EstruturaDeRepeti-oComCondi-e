package l4;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tabuada digital\n");
        System.out.print("Digite um número, e saiba a sua tabuada: ");
        int numeroDeEntrada = input.nextInt();
        input.close();

        int multiplicador = 1;
        while (multiplicador <= 10) {


            int resultado = numeroDeEntrada * multiplicador;
            System.out.println(numeroDeEntrada + " x " + multiplicador + " = " + resultado);
            multiplicador++;
        }

    }
}
