package br.com.gerenciador;
import java.time.LocalDate;

public abstract class Produto {
    protected String nome;
    protected Double quantidade;
    protected LocalDate datacompra;
    protected LocalDate validade;
    protected String localArmazenamento;
    protected String marca;

    public abstract String getCategoria();package br.com.gerenciador;

import java.time.LocalDate;

/**
 * Classe abstrata que representa um produto no sistema de gerenciamento de despensa.
 * Esta classe serve como base para outros tipos de produtos, como alimentos, produtos de higiene, etc.
 */
public abstract class Produto {
    /**
     * Nome do produto.
     */
    protected String nome;

    /**
     * Quantidade do produto.
     */
    protected Double quantidade;

    /**
     * Data de compra do produto.
     */
    protected LocalDate datacompra;

    /**
     * Data de validade do produto.
     */
    protected LocalDate validade;

    /**
     * Local de armazenamento do produto.
     */
    protected String localArmazenamento;

    /**
     * Marca do produto.
     */
    protected String marca;

    /**
     * Método abstrato que deve ser implementado pelas subclasses para retornar a categoria do produto.
     *
     * @return A categoria do produto.
     */
    public abstract String getCategoria();

    /**
     * Retorna o nome do produto.
     *
     * @return O nome do produto.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do produto.
     *
     * @param nome O nome do produto.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna a quantidade do produto.
     *
     * @return A quantidade do produto.
     */
    public Double getQuantidade() {
        return quantidade;
    }

    /**
     * Define a quantidade do produto.
     *
     * @param quantidade A quantidade do produto.
     */
    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Retorna a data de compra do produto.
     *
     * @return A data de compra do produto.
     */
    public LocalDate getDatacompra() {
        return datacompra;
    }

    /**
     * Define a data de compra do produto.
     *
     * @param datacompra A data de compra do produto.
     */
    public void setDatacompra(LocalDate datacompra) {
        this.datacompra = datacompra;
    }

    /**
     * Retorna a data de validade do produto.
     *
     * @return A data de validade do produto.
     */
    public LocalDate getValidade() {
        return validade;
    }

    /**
     * Define a data de validade do produto.
     *
     * @param validade A data de validade do produto.
     */
    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    /**
     * Retorna o local de armazenamento do produto.
     *
     * @return O local de armazenamento do produto.
     */
    public String getLocalArmazenamento() {
        return localArmazenamento;
    }

    /**
     * Define o local de armazenamento do produto.
     *
     * @param localArmazenamento O local de armazenamento do produto.
     */
    public void setLocalArmazenamento(String localArmazenamento) {
        this.localArmazenamento = localArmazenamento;
    }

    /**
     * Retorna a marca do produto.
     *
     * @return A marca do produto.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define a marca do produto.
     *
     * @param marca A marca do produto.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Construtor da classe Produto.
     *
     * @param nome Nome do produto.
     * @param quantidade Quantidade do produto.
     * @param localArmazenamento Local de armazenamento do produto.
     * @param datacompra Data de compra do produto.
     * @param validade Data de validade do produto.
     * @param marca Marca do produto.
     */
    public Produto(String nome, Double quantidade, String localArmazenamento, LocalDate datacompra, LocalDate validade, String marca) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.localArmazenamento = localArmazenamento;
        this.datacompra = datacompra;
        this.validade = validade;
        this.marca = marca;
    }
}

