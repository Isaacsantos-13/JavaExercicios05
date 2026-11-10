import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio27 {
    static class Aluno implements Comparable<Aluno> {
        int matricula;
        String nome;

        Aluno(int matricula, String nome) {
            this.matricula = matricula;
            this.nome = nome;
        }

        @Override
        public int compareTo(Aluno outro) {
            return Integer.compare(this.matricula, outro.matricula);
        }

        @Override
        public String toString() { return matricula + " - " + nome; }
    }

    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>(List.of(
                new Aluno(102, "Carlos"),
                new Aluno(101, "Ana")
        ));

        Collections.sort(alunos);
        alunos.forEach(System.out::println);
    }
}