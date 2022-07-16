package exercicios.loop;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

import java.util.Scanner;

public class nomeIdade_loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //para ler algo precisa criar um fluxo de entrada
        // através teclado pela classe Scanner - importou a classe

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = scan.next(); // o scan faz a leitura e o método next armazena esse nome na variável

            if (nome.equals("0")) {
                break;
            }
            System.out.println("Idade: ");
            idade = scan.nextInt(); // o nextint é para armazenar inteiro

            System.out.println("Nome: " + nome + " - idade: " + idade);
        }

    }
}
