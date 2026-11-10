import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercicio15 {
    public static void main(String[] args) {
        List<String> palavras = List.of("java", "codigo", "java", "intellij", "codigo", "java");
        Map<String, Integer> frequencia = new HashMap<>();

        for (String palavra : palavras) {
            frequencia.merge(palavra, 1, Integer::sum);
        }

        System.out.println("Frequência de palavras: " + frequencia);
    }
}