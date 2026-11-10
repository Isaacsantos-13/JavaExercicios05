public class Exercicio11 {
    static void validarIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("A idade não pode ser negativa.");
        }
        System.out.println("Idade válida: " + idade);
    }

    public static void main(String[] args) {
        try {
            validarIdade(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }
    }
}