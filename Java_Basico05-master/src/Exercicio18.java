import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercicio18 {
    record Produto(String nome, double preco) {}

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>(List.of(
                new Produto("Monitor", 850.0),
                new Produto("Mouse", 75.0),
                new Produto("Teclado", 150.0)
        ));

        produtos.sort(Comparator.comparingDouble(Produto::preco));
        produtos.forEach(System.out::println);
    }
}