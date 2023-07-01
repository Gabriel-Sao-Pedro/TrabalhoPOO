package Model;

import java.util.HashMap;
import java.util.Map;

public class ReciboFiscal {
    private Map<Integer, Produto> produtos = new HashMap<>();
    private Map<Integer, Integer> quantidades = new HashMap<>();
    private String data;
    private int id;
    private float valor;

    public ReciboFiscal(int id, float valor, String data) {
        setId(id);
        setValor(valor);
        setData(data);
    }

    public void visualizar() {
        for (Map.Entry<Integer, Produto> entry : produtos.entrySet()) {
            int codigo = entry.getKey();
            Produto produto = entry.getValue();

            System.out.println("Código: " + codigo);
            System.out.println("Produto: " + produto.getNome());
            System.out.println("Quantidade: " + produto.getQuantidade());
            System.out.println();
        }
    }

    public void addProduto(Produto produto, int quantidade) {
        produtos.put(produto.getCodBarras(), produto);
        quantidades.put(produto.getCodBarras(), quantidade);
    }

    public Map<Integer, Produto> getProdutos() {
        return produtos;
    }

    public Map<Integer, Integer> getQuantidades() {
        return quantidades;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
