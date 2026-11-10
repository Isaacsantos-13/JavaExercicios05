import java.util.HashSet;
import java.util.Set;

public class Exercicio05 {
    public static void main(String[] args) {
        Set<String> nomesSet = new HashSet<>();
        nomesSet.add("Ana");
        nomesSet.add("Bruno");
        nomesSet.add("Ana"); // Duplicado ignorado pelo Set

        System.out.println("Tamanho do HashSet (sem duplicados): " + nomesSet.size());
        System.out.println("Elementos: " + nomesSet);
    }
}