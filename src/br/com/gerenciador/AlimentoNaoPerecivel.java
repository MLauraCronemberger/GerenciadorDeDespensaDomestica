package br.com.gerenciador;
import java.time.LocalDate;

public class AlimentoNaoPerecivel extends Alimento {
    protected boolean enlatado;
    protected boolean embalagemVacuo;
    protected String modoArmazenamento; // Ex: lugar seco, fresco

    public AlimentoNaoPerecivel(String nome, Double quantidade, String localArmazenamento, LocalDate datacompra, LocalDate validade, String marca, String restricoesAlimentares, boolean organico, boolean importado, boolean enlatado, boolean embalagemVacuo, String modoArmazenamento) {
        super(nome, quantidade, localArmazenamento, datacompra, validade, marca, restricoesAlimentares, organico, importado);
        this.enlatado = enlatado;
        this.embalagemVacuo = embalagemVacuo;
        this.modoArmazenamento = modoArmazenamento;
    }
}
