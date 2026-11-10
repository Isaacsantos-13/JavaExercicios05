import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercicio14 {
    public static void main(String[] args) {
        List<Integer> comDuplicados = List.of(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> semDuplicados = new HashSet<>(comDuplicados);

        System.out.println("IDs sem duplicidade: " + semDuplicados);
    }
}