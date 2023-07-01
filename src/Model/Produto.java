package Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Produto {
    private String nome;
    private float preco;
    private int codBarras;
    private int quantidade;
    private LocalDate dataFabricacao;
    private LocalDate dataValidade;
    
    public Produto(String nome, float preco, int codBarras, int quantidade, String dataFabricacao, String dataValidade) {
        setNome(nome);
        setPreco(preco);
        setCodBarras(codBarras);
        setQuantidade(quantidade);
        setDataFabricacao(dataFabricacao);
        setDataValidade(dataValidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(int codBarras) {
        this.codBarras = codBarras;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            throw new IllegalArgumentException("A quantidade não pode ser negativa.");
        }
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = LocalDate.parse(dataFabricacao, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = LocalDate.parse(dataValidade, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
