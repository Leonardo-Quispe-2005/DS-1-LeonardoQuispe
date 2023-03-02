package aula02;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] arg) {

        Scanner x = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double A = x.nextDouble();

        System.out.println("Digite o valor de B: ");
        double B = x.nextDouble();

        double divisao = A / B;
        System.out.println("A divisão é de: " + divisao);

    }
}
