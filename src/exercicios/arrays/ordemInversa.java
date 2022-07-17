package exercicios.arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class ordemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4}; // vetor de 5 posições(pq começa no 0) e de 6 elementos.

        // System.out.println(vetor); // se colocar assim, vai mostrar onde está o array na memória do computador ([I@1b28cdfa)
        // precisa criar um loop/laço de repetição para ver os vetores.

        System.out.print("Vetor original: ");
        int count = 0;
        while (count < (vetor.length)) { // a propriedade length retorna o tamanho do vetor
            System.out.print(vetor[count] + " "); //vetor na posição 0 que vai ser o -5, count++ vai pra posição 1, vai ser o -6...
            count++;
        }

        System.out.print("\nVetor invertido: ");
        for(int i = (vetor.length - 1); i >= 0; i--) { //-1 pq precisa percorrer somente as 5 posições. i-- para ficar decrescente.
            System.out.print(vetor[i] + " ");
        }
    }
}

