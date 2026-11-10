@FunctionalInterface
interface SaudacaoFuncional {
    void saudar(String nome);
}

public class Exercicio10 {
    public static void main(String[] args) {
        SaudacaoFuncional s = nome -> System.out.println("Olá, " + nome + "! Bem-vindo ao Java funcional.");
        s.saudar("Jeferson");
    }
}