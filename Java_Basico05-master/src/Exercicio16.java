import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercicio16 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        Iterator<Integer> it = numeros.iterator();

        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove(); // Remove com segurança durante a iteração
            }
        }

        System.out.println("Apenas ímpares restantes: " + numeros);
    }
}