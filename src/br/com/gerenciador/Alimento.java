package br.com.gerenciador;

import java.time.LocalDate;

/**
 * Classe que representa um alimento no sistema de gerenciamento de despensa.
 * Esta classe herda da classe {@link Produto} e adiciona atributos específicos para alimentos,
 * como restrições alimentares e se o produto é orgânico.
 */
public class Alimento extends Produto {
    /**
     * Restrições alimentares do alimento, como "sem glúten" ou "sem lactose".
     */
    protected String restricoesAlimentares;

    /**
     * Indica se o alimento é orgânico.
     */
    protected boolean organico;

    /**
     * Retorna as restrições alimentares do alimento.
     *
     * @return Uma string contendo as restrições alimentares.
     */
    public String getRestricoesAlimentares() {
        return restricoesAlimentares;
    }

    /**
     * Define as restrições alimentares do alimento.
     *
     * @param restricoesAlimentares Uma string contendo as restrições alimentares.
     */
    public void setRestricoesAlimentares(String restricoesAlimentares) {
        this.restricoesAlimentares = restricoesAlimentares;
    }

    /**
     * Retorna se o alimento é orgânico.
     *
     * @return {@code true} se o alimento é orgânico, {@code false} caso contrário.
     */
    public boolean getOrganico() {
        return organico;
    }

    /**
     * Define se o alimento é orgânico.
     *
     * @param organico {@code true} para indicar que o alimento é orgânico, {@code false} caso contrário.
     */
    public void setOrganico(boolean organico) {
        this.organico = organico;
    }

    /**
     * Construtor da classe Alimento.
     *
     * @param nome Nome do alimento.
     * @param quantidade Quantidade do alimento.
     * @param localArmazenamento Local onde o alimento é armazenado.
     * @param datacompra Data de compra do alimento.
     * @param validade Data de validade do alimento.
     * @param marca Marca do alimento.
     * @param restricoesAlimentares Restrições alimentares do alimento.
     * @param organico Indica se o alimento é orgânico.
     */
    public Alimento(String nome, Double quantidade, String localArmazenamento, LocalDate datacompra, LocalDate validade, String marca, String restricoesAlimentares, boolean organico) {
        super(nome, quantidade, localArmazenamento, datacompra, validade, marca);
        this.restricoesAlimentares = restricoesAlimentares;
        this.organico = organico;
    }

    /**
     * Retorna a categoria do produto, que no caso é "Alimento".
     *
     * @return Uma string representando a categoria do produto.
     */
    @Override
    public String getCategoria() {
        return "Alimento";
    }
}
