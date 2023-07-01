package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Carrinho {
    private static ArrayList<Produto> Sacola = new ArrayList<>();
    private static ArrayList<Integer> Quantis = new ArrayList<>();
    
    public static void addProduto(int codBarras, int quantidade) {
        if (Estoque.getListaProdutos().containsKey(codBarras)){
            Produto produto = Estoque.getListaProdutos().get(codBarras);
            if(produto.getQuantidade() >= quantidade){
                Sacola.add(produto);
                Quantis.add(quantidade);
            } else {
                System.out.println("Estoque insuficiente");
            }
        }
    }

    public static void removerProduto(int codBarras) {
        for (int i = 0; i < Sacola.size(); i++) {
            Produto produto = Sacola.get(i);
            if (codBarras == produto.getCodBarras()) {
                Sacola.remove(i);
                Quantis.remove(i);
                return;
            }
        }
        System.out.println("Produto não está na sacola");
    }

    public static float calcularTotal() {
        float total = 0;
        for (int i = 0; i < Sacola.size(); i++) {
            Produto produto = Sacola.get(i);
            int quantidade = Quantis.get(i);
            total += produto.getPreco() * quantidade;
        }
        return total;
    }

    public static ReciboFiscal gerarRecibo() {
        float total = calcularTotal();
        if (total != 0) {
            int i = 1;
            LocalDate dataAtual = LocalDate.now(); 
            String data = dataAtual.toString();
            ReciboFiscal recibo = new ReciboFiscal(i, total, data);
            i++;
            return recibo;
        } else {
            throw new IllegalArgumentException("Valor do carrinho indefinido");
        }
    }

    public static void finalizarCompra() {
        ReciboFiscal recibo = gerarRecibo();
        for (int i = 0; i < Sacola.size(); i++) {
            Produto produto = Sacola.get(i);
            int quantidade = Quantis.get(i);
            
            if (quantidade > 0) {
                recibo.addProduto(produto, quantidade);
                int quantidadeProduto = produto.getQuantidade();
                produto.setQuantidade(quantidadeProduto - quantidade);
            }
        }
        Histórico.addProduto(recibo);
        Caixa.addTotal(recibo.getValor());
        Sacola.clear();
        Quantis.clear();
    }
}
