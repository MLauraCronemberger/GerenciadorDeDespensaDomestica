package br.com.gerenciador;
import java.time.LocalDate;

public class AlimentoNaoPerecivel extends Alimento {
    protected boolean enlatado;
    protected boolean embalagemVacuo;
    protected String modoArmazenamento; // Ex: lugar seco, fresco

    public boolean getEnlatado() {
        return enlatado;
    }

    public void setEnlatado(boolean enlatado) {
        this.enlatado = enlatado;
    }

    public boolean getEmbalagemVacuo() {
        return embalagemVacuo;
    }

    public void setEmbalagemVacuo(boolean embalagemVacuo) {
        this.embalagemVacuo = embalagemVacuo;
    }

    public String getModoArmazenamento() {
        return modoArmazenamento;
    }

    public void setModoArmazenamento(String modoArmazenamento) {
        this.modoArmazenamento = modoArmazenamento;
    }

    public AlimentoNaoPerecivel(String nome, Double quantidade, String localArmazenamento, LocalDate datacompra, LocalDate validade, String marca, String restricoesAlimentares, boolean organico, boolean enlatado, boolean embalagemVacuo, String modoArmazenamento) {
        super(nome, quantidade, localArmazenamento, datacompra, validade, marca, restricoesAlimentares, organico);
        this.enlatado = enlatado;
        this.embalagemVacuo = embalagemVacuo;
        this.modoArmazenamento = modoArmazenamento;
    }
}
