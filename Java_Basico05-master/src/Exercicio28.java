import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercicio28 {
    record Aluno(String nome, double nota) {}

    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>(List.of(
                new Aluno("Bruno", 7.5),
                new Aluno("Ana", 9.0)
        ));

        System.out.println("Ordenado por Nome:");
        alunos.sort(Comparator.comparing(Aluno::nome));
        alunos.forEach(System.out::println);

        System.out.println("\nOrdenado por Nota (Decrescente):");
        alunos.sort(Comparator.comparingDouble(Aluno::nota).reversed());
        alunos.forEach(System.out::println);
    }
}