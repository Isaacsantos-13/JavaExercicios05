import java.util.HashMap;
import java.util.Map;

public class Exercicio24 {
    record Produto(int id, String nome) {}

    static class Catalogo {
        private final Map<Integer, Produto> dados = new HashMap<>();

        void cadastrar(Produto p) { dados.put(p.id(), p); }
        Produto buscar(int id) { return dados.get(id); }
        void remover(int id) { dados.remove(id); }
    }

    public static void main(String[] args) {
        Catalogo c = new Catalogo();
        c.cadastrar(new Produto(1, "Notebook"));

        System.out.println("Buscando ID 1: " + c.buscar(1));
        c.remover(1);
        System.out.println("Após remover ID 1: " + c.buscar(1));
    }
}