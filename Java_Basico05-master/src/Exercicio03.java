import java.util.ArrayList;
import java.util.List;

public class Exercicio03 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");

        System.out.println("Tamanho da lista: " + nomes.size());
        System.out.println("Elemento no índice 1: " + nomes.get(1));
    }
}