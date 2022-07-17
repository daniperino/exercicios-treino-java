package exercicios.loop;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado

        int quantNumeros;
        int par = 0;
        int impar = 0;

        System.out.println("Digite a quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0; // Controla o loop.

        do {
            System.out.println("Digite um número: ");
            int numero = scan.nextInt();

            if(numero % 2 == 0) par++; //se o resto da divisão do número por 2 (numero/2) for 0, acrescente o valor 1 a variável quantPar.

            else //caso contrário, o número digitado é ímpar.
                impar++; //adicione o valor 1 a variável quantImpar.

            count++; //some o valor 1 ao contador até que invalide a condição do loop. (count < quantNumeros).
        }while (count < quantNumeros);

        System.out.println("Quantidade de números pares: " +par);
        System.out.println("Quantidade de números inpares: " +impar);
    }

}
