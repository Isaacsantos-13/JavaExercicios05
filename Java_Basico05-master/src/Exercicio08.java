import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercicio08 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(10, 20, 30);
        Iterator<Integer> it = numeros.iterator();

        while (it.hasNext()) {
            System.out.println("Número: " + it.next());
        }
    }
}