
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Beecrowd1259 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);

        //declarar variável
        int N;

        //ler variável
        N = scanner.nextInt();

        //declarar listas
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        //ler os valores e separar em listas pares ou ímpares
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }
        }

        //organizar a lista par em ordem crescente
        Collections.sort(pares);

        //organizar a lista ímpar em ordem decrescente
        Collections.sort(impares, Collections.reverseOrder());

        //imprimir resultado no console
        for (int par : pares) {
            System.out.println(par);
        }
        for (int impar : impares) {
            System.out.println(impar);
        }
    }
}
