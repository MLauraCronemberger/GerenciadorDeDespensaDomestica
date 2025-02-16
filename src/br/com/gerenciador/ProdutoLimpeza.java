package br.com.gerenciador;

import java.time.LocalDate;

/**
 * Representa um produto de limpeza no sistema de gerenciamento de produtos.
 * Herda da classe {@link Produto} e adiciona a informação sobre inflamabilidade.
 */
public class ProdutoLimpeza extends Produto {

    /**
     * Indica se o produto é inflamável.
     */
    protected boolean inflamavel;

    /**
     * Retorna a categoria do produto.
     *
     * @return String representando a categoria "Limpeza".
     */
    @Override
    public String getCategoria() {
        return "Limpeza";
    }

    /**
     * Verifica se o produto é inflamável.
     *
     * @return {@code true} se o produto for inflamável, {@code false} caso contrário.
     */
    public boolean isInflamavel() {
        return inflamavel;
    }

    /**
     * Define se o produto é inflamável.
     *
     * @param inflamavel Valor booleano indicando se o produto é inflamável.
     */
    public void setInflamavel(boolean inflamavel) {
        this.inflamavel = inflamavel;
    }

    /**
     * Construtor da classe ProdutoLimpeza.
     *
     * @param nome Nome do produto.
     * @param quantidade Quantidade disponível do produto.
     * @param localArmazenamento Local onde o produto está armazenado.
     * @param datacompra Data de compra do produto.
     * @param validade Data de validade do produto.
     * @param marca Marca do produto.
     * @param inflamavel Indica se o produto é inflamável.
     */
    public ProdutoLimpeza(String nome, Double quantidade, String localArmazenamento, LocalDate datacompra, LocalDate validade, String marca, boolean inflamavel) {
        super(nome, quantidade, localArmazenamento, datacompra, validade, marca);
        this.inflamavel = inflamavel;
    }
}
