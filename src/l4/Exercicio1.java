package l4;

import java.util.Scanner;
// Informando o produto mais barato
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o preço do primeiro produto: ");
        double produto1 = input.nextDouble();
        System.out.print("Informe o preço do segundo produto: ");
        double produto2 = input.nextDouble();
        System.out.print("Informe o preço do terceiro produto: ");
        double produto3 = input.nextDouble();
        input.close();

        if (produto1 < produto2 && produto1 < produto3) {
            System.out.print("Você deve comprar o primeiro produto, pois ele é o mais barato.");
        } else if (produto2 < produto1 && produto2 < produto3) {
            System.out.print("Você deve comprar o segundo produto, pois ele é o mais barato.");
        } else if (produto3 < produto1 && produto3 < produto2) {
            System.out.print("Você deve comprar o terceiro produto, pois ele é o mais barato.");
        }
    }
}
