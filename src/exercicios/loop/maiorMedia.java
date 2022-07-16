package exercicios.loop;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class maiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double maior = 0;
        double media;
        double soma = 0;

        int count = 0; //contador
        do {
            System.out.println("Número: ");
            double numero = scan.nextDouble();

            soma = soma + numero;

            if(numero > maior) maior = numero;
            count = count +1;

        }while (count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Media: " + (soma/5));






    }
}
