package br.com.gerenciador;
import java.time.LocalDate;

public abstract class Produto {
    protected String nome;
    protected Double quantidade;
    protected LocalDate datacompra;
    protected LocalDate validade;
    protected String localArmazenamento;
    protected String marca;

    //Inicializa o método abstrato getCategoria
    public abstract String getCategoria();

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getDatacompra() {
        return datacompra;
    }

    public void setDatacompra(LocalDate datacompra) {
        this.datacompra = datacompra;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public String getLocalArmazenamento() {
        return localArmazenamento;
    }

    public void setLocalArmazenamento(String localArmazenamento) {
        this.localArmazenamento = localArmazenamento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //Construtor da classe Produto
    public Produto(String nome, Double quantidade, String localArmazenamento, LocalDate datacompra, LocalDate validade, String marca) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.localArmazenamento = localArmazenamento;
        this.datacompra = datacompra;
        this.validade = validade;
        this.marca = marca;
    }
}

