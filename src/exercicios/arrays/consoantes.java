package exercicios.arrays;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.*/

import java.util.Scanner;

public class consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[]consoantes = new String[6];

        int quantidadeDeConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            // equalsIgnoreCase compara a String com a letra e retorna true se for igual ou false se for diferente
            if(!(letra.equalsIgnoreCase("a") || // se !não for a igual a, e ,i ,o, u pega o array de consoantes e
                 letra.equalsIgnoreCase("e") || // na posição [0] count, vai ser igual a letra que for digitado.
                 letra.equalsIgnoreCase("i") ||
                 letra.equalsIgnoreCase("o") ||
                 letra.equalsIgnoreCase("u"))){
                consoantes[count] = letra;
                quantidadeDeConsoantes++;
            }

            count++;

        }while (count < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes) {
            if (consoante != null)
                System.out.print(consoante + " ");

        }
        System.out.println("Quantidade de consoantes: " + quantidadeDeConsoantes);
    }

}