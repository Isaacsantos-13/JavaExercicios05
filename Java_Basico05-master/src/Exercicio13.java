public class Exercicio13 {
    public static void main(String[] args) {
        try {
            String[] dados = {"10", "20"};
            int indice = Integer.parseInt("abc"); // Gera NumberFormatException
            System.out.println(dados[indice]);
        } catch (NumberFormatException e) {
            System.out.println("Tratado: Erro de formato numérico.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Tratado: Índice fora dos limites do array.");
        }
    }
}