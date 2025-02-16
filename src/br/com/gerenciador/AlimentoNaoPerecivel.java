package br.com.gerenciador;

import java.time.LocalDate;

/**
 * Classe que representa um alimento não perecível no sistema de gerenciamento de despensa.
 * Esta classe herda da classe {@link Alimento} e adiciona atributos específicos para alimentos não perecíveis,
 * como se o alimento é enlatado, se está embalado a vácuo e o modo de armazenamento recomendado.
 */
public class AlimentoNaoPerecivel extends Alimento {
    /**
     * Indica se o alimento é enlatado.
     */
    protected boolean enlatado;

    /**
     * Indica se o alimento está embalado a vácuo.
     */
    protected boolean embalagemVacuo;

    /**
     * Modo de armazenamento recomendado para o alimento (ex: lugar seco, fresco).
     */
    protected String modoArmazenamento;

    /**
     * Retorna se o alimento é enlatado.
     *
     * @return {@code true} se o alimento é enlatado, {@code false} caso contrário.
     */
    public boolean getEnlatado() {
        return enlatado;
    }

    /**
     * Define se o alimento é enlatado.
     *
     * @param enlatado {@code true} para indicar que o alimento é enlatado, {@code false} caso contrário.
     */
    public void setEnlatado(boolean enlatado) {
        this.enlatado = enlatado;
    }

    /**
     * Retorna se o alimento está embalado a vácuo.
     *
     * @return {@code true} se o alimento está embalado a vácuo, {@code false} caso contrário.
     */
    public boolean getEmbalagemVacuo() {
        return embalagemVacuo;
    }

    /**
     * Define se o alimento está embalado a vácuo.
     *
     * @param embalagemVacuo {@code true} para indicar que o alimento está embalado a vácuo, {@code false} caso contrário.
     */
    public void setEmbalagemVacuo(boolean embalagemVacuo) {
        this.embalagemVacuo = embalagemVacuo;
    }

    /**
     * Retorna o modo de armazenamento recomendado para o alimento.
     *
     * @return Uma string contendo o modo de armazenamento (ex: lugar seco, fresco).
     */
    public String getModoArmazenamento() {
        return modoArmazenamento;
    }

    /**
     * Define o modo de armazenamento recomendado para o alimento.
     *
     * @param modoArmazenamento Uma string contendo o modo de armazenamento (ex: lugar seco, fresco).
     */
    public void setModoArmazenamento(String modoArmazenamento) {
        this.modoArmazenamento = modoArmazenamento;
    }

    /**
     * Construtor da classe AlimentoNaoPerecivel.
     *
     * @param nome Nome do alimento.
     * @param quantidade Quantidade do alimento.
     * @param localArmazenamento Local onde o alimento é armazenado.
     * @param datacompra Data de compra do alimento.
     * @param validade Data de validade do alimento.
     * @param marca Marca do alimento.
     * @param restricoesAlimentares Restrições alimentares do alimento.
     * @param organico Indica se o alimento é orgânico.
     * @param enlatado Indica se o alimento é enlatado.
     * @param embalagemVacuo Indica se o alimento está embalado a vácuo.
     * @param selected Parâmetro não utilizado (pode ser removido ou revisado).
     * @param modoArmazenamento Modo de armazenamento recomendado para o alimento.
     */
    public AlimentoNaoPerecivel(String nome, Double quantidade, String localArmazenamento, LocalDate datacompra, LocalDate validade, String marca, String restricoesAlimentares, boolean organico, boolean enlatado, boolean embalagemVacuo, boolean selected, String modoArmazenamento) {
        super(nome, quantidade, localArmazenamento, datacompra, validade, marca, restricoesAlimentares, organico);
        this.enlatado = enlatado;
        this.embalagemVacuo = embalagemVacuo;
        this.modoArmazenamento = modoArmazenamento;
    }
}
