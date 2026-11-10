import java.io.IOException;

public class Exercicio22 {
    static void simularIO() throws IOException {
        throw new IOException("Erro crítico de leitura de arquivo.");
    }

    public static void main(String[] args) {
        try {
            simularIO();
        } catch (IOException e) {
            System.out.println("Tratado no main: " + e.getMessage());
        }
    }
}