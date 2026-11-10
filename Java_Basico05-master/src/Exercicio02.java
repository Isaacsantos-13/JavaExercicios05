public class Exercicio02 {
    public static void main(String[] args) {
        try {
            int valor1 = Integer.parseInt("123");
            System.out.println("Convertido com sucesso: " + valor1);

            int valor2 = Integer.parseInt("abc"); // Provoca NumberFormatException
            System.out.println("Convertido: " + valor2);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Formato numérico inválido.");
        }
    }
}