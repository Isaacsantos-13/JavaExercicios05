public class Exercicio19 {
    static class Caixa<T> {
        private T conteudo;

        public void guardar(T conteudo) { this.conteudo = conteudo; }
        public T abrir() { return conteudo; }
    }

    public static void main(String[] args) {
        Caixa<String> caixaTexto = new Caixa<>();
        caixaTexto.guardar("Segredo");
        System.out.println("Caixa de String: " + caixaTexto.abrir());

        Caixa<Integer> caixaNumero = new Caixa<>();
        caixaNumero.guardar(42);
        System.out.println("Caixa de Integer: " + caixaNumero.abrir());
    }
}