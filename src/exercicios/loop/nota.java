package exercicios.loop;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo até que o usuário informe um valor válido.*/

import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Digite uma nota de 0 a 10: ");
        nota = scan.nextInt(); //entrada de dados

        if (nota < 0 || nota > 10){ // ou poderia trocar o if por while sem o break
            System.out.println("Nota inválida!");
            System.out.println("Tente novamente!");
            System.out.println("Nota:");
            nota = scan.nextInt(); //entrada de dados


        }else
        System.out.println("Nota: " + nota);

    }
}
