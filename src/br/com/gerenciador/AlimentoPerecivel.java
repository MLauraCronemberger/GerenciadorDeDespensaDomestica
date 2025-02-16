package br.com.gerenciador;

import java.time.LocalDate;

/**
 * Classe que representa um alimento perecível no sistema de gerenciamento de despensa.
 * Esta classe herda da classe {@link Alimento} e adiciona atributos específicos para alimentos perecíveis,
 * como se o alimento precisa ser refrigerado, se precisa ser congelado e a data de fabricação.
 */
public class AlimentoPerecivel extends Alimento {
    /**
     * Indica se o alimento precisa ser refrigerado.
     */
    protected boolean refrigerado;

    /**
     * Indica se o alimento precisa ser congelado.
     */
    protected boolean congelado;

    /**
     * Data de fabricação do alimento.
     */
    protected LocalDate dataFabricacao;

    /**
     * Retorna se o alimento precisa ser refrigerado.
     *
     * @return {@code true} se o alimento precisa ser refrigerado, {@code false} caso contrário.
     */
    public boolean getRefrigerado() {
        return refrigerado;
    }

    /**
     * Define se o alimento precisa ser refrigerado.
     *
     * @param refrigerado {@code true} para indicar que o alimento precisa ser refrigerado, {@code false} caso contrário.
     */
    public void setRefrigerado(boolean refrigerado) {
        this.refrigerado = refrigerado;
    }

    /**
     * Retorna se o alimento precisa ser congelado.
     *
     * @return {@code true} se o alimento precisa ser congelado, {@code false} caso contrário.
     */
    public boolean getCongelado() {
        return congelado;
    }

    /**
     * Define se o alimento precisa ser congelado.
     *
     * @param congelado {@code true} para indicar que o alimento precisa ser congelado, {@code false} caso contrário.
     */
    public void setCongelado(boolean congelado) {
        this.congelado = congelado;
    }

    /**
     * Retorna a data de fabricação do alimento.
     *
     * @return A data de fabricação do alimento.
     */
    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    /**
     * Define a data de fabricação do alimento.
     *
     * @param dataFabricacao A data de fabricação do alimento.
     */
    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    /**
     * Construtor da classe AlimentoPerecivel.
     *
     * @param nome Nome do alimento.
     * @param quantidade Quantidade do alimento.
     * @param localArmazenamento Local onde o alimento é armazenado.
     * @param datacompra Data de compra do alimento.
     * @param validade Data de validade do alimento.
     * @param marca Marca do alimento.
     * @param restricoesAlimentares Restrições alimentares do alimento.
     * @param organico Indica se o alimento é orgânico.
     * @param refrigerado Indica se o alimento precisa ser refrigerado.
     * @param congelado Indica se o alimento precisa ser congelado.
     * @param selected Parâmetro não utilizado (pode ser removido ou revisado).
     * @param dataFabricacao Data de fabricação do alimento.
     */
    public AlimentoPerecivel(String nome, Double quantidade, String localArmazenamento, LocalDate datacompra, LocalDate validade, String marca, String restricoesAlimentares, boolean organico, boolean refrigerado, boolean congelado, boolean selected, LocalDate dataFabricacao) {
        super(nome, quantidade, localArmazenamento, datacompra, validade, marca, restricoesAlimentares, organico);
        this.refrigerado = refrigerado;
        this.congelado = congelado;
        this.dataFabricacao = dataFabricacao;
    }
}
