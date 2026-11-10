import java.util.ArrayDeque;
import java.util.Queue;

public class Exercicio07 {
    public static void main(String[] args) {
        Queue<String> chamados = new ArrayDeque<>();
        chamados.offer("Chamado 01");
        chamados.offer("Chamado 02");
        chamados.offer("Chamado 03");

        System.out.println("Removido da fila: " + chamados.poll());
        System.out.println("Próximo na fila: " + chamados.peek());
    }
}