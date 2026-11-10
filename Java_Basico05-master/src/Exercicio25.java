import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exercicio25 {
    public static void main(String[] args) {
        // ArrayList: Melhor para acesso aleatório por índice e uso geral em memória.
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Item A");
        arrayList.add("Item B");

        // LinkedList: Possui nós encadeados; útil para filas/deques ou inserções pesadas nas pontas.
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Item A");
        linkedList.add("Item B");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
    }
}