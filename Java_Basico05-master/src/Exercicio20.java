import java.util.function.Predicate;

public class Exercicio20 {
    public static void main(String[] args) {
        Predicate<Integer> ePositivo = n -> n > 0;

        System.out.println("10 é positivo? " + ePositivo.test(10));
        System.out.println("-5 é positivo? " + ePositivo.test(-5));
    }
}