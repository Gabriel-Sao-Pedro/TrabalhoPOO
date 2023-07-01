package Model;

import java.util.Map;

public abstract class Devolucao {
    public static void Estorno(int id) {
        if (Histórico.getHistorico().containsKey(id)) {
            ReciboFiscal recibo = Histórico.getHistorico().get(id);
            Map<Integer, Produto> produtos = recibo.getProdutos();
            for (Map.Entry<Integer, Produto> entry : produtos.entrySet()) {
                int produtoId = entry.getKey();
                Produto produto = entry.getValue();

                if (Estoque.getListaProdutos().containsKey(produtoId)) {
                    int quantidade = produto.getQuantidade();
                    int quantidadeDevolvida = recibo.getQuantidades().get(produtoId);
                    produto.setQuantidade(quantidade + quantidadeDevolvida);
                } else {
                    Estoque.addProduto(produto);
                    produto.setQuantidade(recibo.getQuantidades().get(produtoId));
                }
            }
            Caixa.remDinheiro(recibo.getValor());
            Histórico.getHistorico().remove(id);
        } else {
            System.out.println("Id de Recibo Fiscal não existente");
        }
    }
}
