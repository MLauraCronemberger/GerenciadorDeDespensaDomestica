package br.com.gerenciador;
import java.time.LocalDate;

//Classe filha da classe Alimento
public class AlimentoNaoPerecivel extends Alimento {
    protected boolean enlatado;
    protected boolean embalagemVacuo;
    protected String modoArmazenamento;

    //Polimorfismo- nessa classe o método getCategoria retorna "Alimento Não Perecível"
    @Override
    public String getCategoria() {
        return "Alimento Não Perecível";
    }

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

    //Construtor da classe alimento não perecível
    public AlimentoNaoPerecivel(String nome, Double quantidade, String localArmazenamento, LocalDate validade, String marca, String restricoesAlimentares, boolean organico, boolean enlatado, boolean embalagemVacuo, boolean selected, String modoArmazenamento) {
        super(nome, quantidade, localArmazenamento, validade, marca, restricoesAlimentares, organico);
        this.enlatado = enlatado;
        this.embalagemVacuo = embalagemVacuo;
        this.modoArmazenamento = modoArmazenamento;
    }
}
