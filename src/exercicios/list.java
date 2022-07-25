package exercicios;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(6.0);
        notas.add(0.0);
        notas.add(9.0);
        notas.add(8.5);

        notas.indexOf(8d);
        System.out.println(notas);

        notas.add(2, 5d);
        System.out.println(notas);

        notas.set(notas.indexOf(7d), 2d);
        System.out.println(notas);
    }
}
