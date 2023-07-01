package Model;

import java.util.HashMap;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.Map;

public abstract class Estoque {
    private static Map<Integer, Produto> listaProdutos = new HashMap<>();
    private static Map<Integer, Produto> produtosVencidos = new HashMap<>();

    public static void addProduto(Produto produto) {
        listaProdutos.put(produto.getCodBarras(), produto);    
    }
    
    public static void remProduto(Produto produto) {
        listaProdutos.remove(produto.getCodBarras());
    }

    public static void addProdutoVencido(Produto produto){
        produtosVencidos.put(produto.getCodBarras(), produto);
    }

    public static void esvaziar() {
        produtosVencidos.clear();
    }

    public static Map<Integer, Produto> getListaProdutos() {
        return listaProdutos;
    }

    
    
    public static void revisao(Map<Integer, Produto> listaProdutos) {
        LocalDate dataAtual = LocalDate.now();
        Iterator<Map.Entry<Integer, Produto>> iterator = listaProdutos.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, Produto> entry = iterator.next();
            Produto produto = entry.getValue();
            LocalDate dataValidade = produto.getDataValidade();

            if (produto.getQuantidade() <= 0) {
                iterator.remove();
                continue;
            }

            if (dataValidade.isBefore(dataAtual)) {
                System.out.println("Produto vencido retirado do estoque: " + produto.getNome());
                iterator.remove();
                addProdutoVencido(produto);
            } else if (dataValidade.isEqual(dataAtual)) {
                System.out.println("Válido até hoje: " + produto.getNome() + ", produto removido do estoque.");
                iterator.remove();
                addProdutoVencido(produto);
            } else {
                LocalDate dataProxima = dataAtual.plusDays(10);
                if (dataValidade.isBefore(dataProxima) || dataValidade.isEqual(dataProxima)) {
                    System.out.println("Produto com validade próxima removido: " + produto.getNome());
                    iterator.remove();
                    addProdutoVencido(produto);
                } else {
                    System.out.println("Produto válido: " + produto.getNome());
                    System.out.println("Quantidade: " + produto.getQuantidade());
                    System.out.println();
                }
            }
        }
    }   
}
