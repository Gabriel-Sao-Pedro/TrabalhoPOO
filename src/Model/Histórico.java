package Model;

import java.util.HashMap;
import java.util.Map;

public abstract class Histórico {
    private static Map<Integer, ReciboFiscal> historico = new HashMap<>();

    public static Map<Integer, ReciboFiscal> getHistorico() {
        return historico;
    }

    public static void visualizar() {
        for (Map.Entry<Integer, ReciboFiscal> entry : historico.entrySet()) {
            int id = entry.getKey();
            ReciboFiscal recibo = entry.getValue();

            System.out.println("Recibo Fiscal: " + id);
            System.out.println("Data: " + recibo.getData());
            System.out.println("Valor do recibo: " + recibo.getValor());
            System.out.println();
        }
    }

    public static void Imprimir(int id) {
        ReciboFiscal recibo = historico.get(id);
        if (recibo != null) {
            System.out.println("Recibo Fiscal: " + id + " Data: " + recibo.getData());

            Map<Integer, Produto> produtos = recibo.getProdutos();
            Map<Integer, Integer> quantidades = recibo.getQuantidades();

            for (int i = 0; i < produtos.size(); i++) {
                int quantidade = quantidades.get(i);
                Produto produto = produtos.get(i);

                System.out.println("Quantidade: " + quantidade + ", Produto: " + produto.getNome());
            }

            System.out.println("Valor do recibo: " + recibo.getValor());
        }
    }

    public static void addProduto(ReciboFiscal recibo) {
        historico.put(recibo.getId(), recibo);
    }

    public static void remProduto(ReciboFiscal recibo) {
        historico.remove(recibo.getId());
    }

    public static void Esvaziar() {
        historico.clear();
    }
}
