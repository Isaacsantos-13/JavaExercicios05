import java.util.ArrayList;
import java.util.List;

public class Exercicio04 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Ana"); // Nome duplicado permitido em List

        System.out.println("Lista com duplicados: " + nomes);
    }
}