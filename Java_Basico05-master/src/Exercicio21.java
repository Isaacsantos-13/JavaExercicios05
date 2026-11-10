public class Exercicio21 {
    static class EstoqueInsuficienteException extends RuntimeException {
        public EstoqueInsuficienteException(String msg) { super(msg); }
    }

    static void retirarEstoque(int atual, int pedido) {
        if (pedido > atual) {
            throw new EstoqueInsuficienteException("Estoque insuficiente. Disponível: " + atual);
        }
    }

    public static void main(String[] args) {
        try {
            retirarEstoque(5, 10);
        } catch (EstoqueInsuficienteException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}