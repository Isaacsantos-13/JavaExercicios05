import java.util.List;

public class Exercicio30 {

    public static double somar(List<? extends Number> valores) {
        double total = 0.0;
        for (Number n : valores) {
            total += n.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Integer> inteiros = List.of(1, 2, 3, 4);
        List<Double> duplos = List.of(1.5, 2.5);

        System.out.println("Soma de inteiros: " + somar(inteiros));
        System.out.println("Soma de doubles: " + somar(duplos));
    }
}