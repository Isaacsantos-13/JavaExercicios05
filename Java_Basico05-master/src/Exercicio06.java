import java.util.HashMap;
import java.util.Map;

public class Exercicio06 {
    public static void main(String[] args) {
        Map<String, Integer> estoque = new HashMap<>();
        estoque.put("Mouse", 10);
        estoque.put("Teclado", 5);
        estoque.put("Monitor", 2);

        System.out.println("Quantidade de Teclados: " + estoque.get("Teclado"));
    }
}