public class Exercicio23 {
    static class ConexaoSimulada implements AutoCloseable {
        public void usar() { System.out.println("Usando recurso..."); }
        @Override
        public void close() { System.out.println("Método close() chamado automaticamente!"); }
    }

    public static void main(String[] args) {
        try (ConexaoSimulada con = new ConexaoSimulada()) {
            con.usar();
        } // O close é disparado automaticamente aqui
    }
}