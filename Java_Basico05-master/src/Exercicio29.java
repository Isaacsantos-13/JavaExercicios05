public class Exercicio29 {
    static <T> T ultimo(T[] valores) {
        if (valores == null || valores.length == 0) return null;
        return valores[valores.length - 1];
    }

    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carla"};
        Integer[] numeros = {10, 20, 30, 40};

        System.out.println("Último nome: " + ultimo(nomes));
        System.out.println("Último número: " + ultimo(numeros));
    }
}