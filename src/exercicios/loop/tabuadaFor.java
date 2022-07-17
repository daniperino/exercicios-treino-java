package exercicios.loop;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

import java.util.Scanner;

public class tabuadaFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada;
        int i;

        System.out.println("Tabuada: ");
        tabuada = scan.nextInt();

        System.out.println("Tabuada do " + tabuada + ":");

        for (i = 1; i <= 10; i++) {
            System.out.println(tabuada + "x" + i + "=" + (tabuada * i));

        }
    }
}

