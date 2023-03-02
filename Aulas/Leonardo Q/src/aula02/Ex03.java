package aula02;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double A = x.nextDouble();

        System.out.println("Digite o valor de B: ");
        double B = x.nextDouble();

        double soma = A + B;
        System.out.println("A soma de A + B é: " + soma);

    }
}
