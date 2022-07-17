package exercicios.loop;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1; //variável para guardar o valor da multiplicação dos valores.

        for (int i = fatorial; i >= 1; i--){ //para: variável i = fatorial, até i maior que 1, diminuimos 1 ao valor de i a cada loop.
            multiplicacao = multiplicacao * i;
        }
        System.out.println(fatorial + "!=" +multiplicacao);
    }
}


