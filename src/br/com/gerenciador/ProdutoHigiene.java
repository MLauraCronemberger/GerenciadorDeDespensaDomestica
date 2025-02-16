package br.com.gerenciador;

import java.time.LocalDate;

/**
 * Classe que representa um produto de higiene.
 * Herda da classe {@code Produto} e adiciona um atributo específico
 * relacionado à parte do corpo para a qual o produto é destinado.
 */
public class ProdutoHigiene extends Produto {

    /**
     * Parte do corpo para a qual o produto de higiene é destinado.
     */
    protected String parteDoCorpo;

    /**
     * Retorna a categoria do produto, que é "Higiene".
     *
     * @return a categoria do produto.
     */
    @Override
    public String getCategoria() {
        return "Higiene";
    }

    /**
     * Obtém a parte do corpo para a qual o produto é destinado.
     *
     * @return a parte do corpo associada ao produto de higiene.
     */
    public String getPartedocorpo() {
        return parteDoCorpo;
    }

    /**
     * Define a parte do corpo para a qual o produto de higiene é destinado.
     *
     * @param partedocorpo a parte do corpo a ser definida.
     */
    public void setPartedocorpo(String partedocorpo) {
        this.parteDoCorpo = partedocorpo;
    }

    /**
     * Construtor da classe {@code ProdutoHigiene}.
     *
     * @param nome o nome do produto.
     * @param quantidade a quantidade do produto.
     * @param localArmazenamento o local onde o produto está armazenado.
     * @param datacompra a data de compra do produto.
     * @param validade a data de validade do produto.
     * @param marca a marca do produto.
     * @param parteDoCorpo a parte do corpo para a qual o produto é destinado.
     */
    public ProdutoHigiene(String nome, Double quantidade, String localArmazenamento, LocalDate datacompra, LocalDate validade, String marca, String parteDoCorpo) {
        super(nome, quantidade, localArmazenamento, datacompra, validade, marca);
        this.parteDoCorpo = parteDoCorpo;
    }
}
