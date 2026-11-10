public class Exercicio12 {
    public static void main(String[] args) {
        String texto = "123a";
        try {
            int resultado = Integer.parseInt(texto);
            System.out.println(resultado);
        } catch (NumberFormatException e) {
            System.out.println("Falha na conversão numérica.");
        } finally {
            System.out.println("[Bloco Finally] Tentativa de conversão finalizada.");
        }
    }
}