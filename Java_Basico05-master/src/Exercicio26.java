import java.util.ArrayDeque;
import java.util.Deque;

public class Exercicio26 {
    public static void main(String[] args) {
        Deque<String> historicoUndo = new ArrayDeque<>();

        historicoUndo.push("Ação 1: Digitar texto");
        historicoUndo.push("Ação 2: Negrito");
        historicoUndo.push("Ação 3: Inserir imagem");

        System.out.println("Desfazendo: " + historicoUndo.pop());
        System.out.println("Estado atual do topo da pilha: " + historicoUndo.peek());
    }
}