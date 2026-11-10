import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio17 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(5, 2, 9, 1, 7));

        Collections.sort(numeros);
        System.out.println("Crescente: " + numeros);

        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("Decrescente: " + numeros);
    }
}