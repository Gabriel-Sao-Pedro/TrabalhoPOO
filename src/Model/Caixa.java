package Model;

public class Caixa {
    private static float dinheiro;

    public static void addTotal(float valor) {
        if (valor >= 0) {
            dinheiro += valor;
        } else {
            throw new IllegalArgumentException("O valor deve ser positivo.");
        }
    }

    public static void remDinheiro(float valor) {
        if (valor > 0) {
            dinheiro -= valor;
        } else {
            throw new IllegalArgumentException("O valor deve ser positivo.");
        }
    }

    public static float getDinheiro() {
        return dinheiro;
    }
}
