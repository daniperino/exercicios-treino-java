package exercicios.loop;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class tabuadaWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        int count = 1;

        do {
            System.out.println("Qual a Tabuada: ");
            tabuada = scan.nextInt();

            System.out.println("Tabuada do " + tabuada + ":");

         count++;
        }while (count <= 10);
        System.out.println(tabuada + "x" + count + "=" + (tabuada*count));
    }
}
