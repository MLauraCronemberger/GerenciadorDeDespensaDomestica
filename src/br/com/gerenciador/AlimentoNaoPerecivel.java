package br.com.gerenciador;
import java.time.LocalDate;

//Classe filha da classe Alimento
public class AlimentoNaoPerecivel extends Alimento {
    protected boolean enlatado;
    protected boolean embalagemVacuo;
    protected String modoArmazenamento;

//Gets e Sets dos atributos
//Get e Set- Enlatado
    public boolean getEnlatado() {
        return enlatado;
    }
    public void setEnlatado(boolean enlatado) {
        this.enlatado = enlatado;
    }

//Get e Set- Embalagem a Vacuo
    public boolean getEmbalagemVacuo() {
        return embalagemVacuo;
    }

    public void setEmbalagemVacuo(boolean embalagemVacuo) {
        this.embalagemVacuo = embalagemVacuo;
    }

//Get e Set- Modo de Armazenamento
    public String getModoArmazenamento() {
        return modoArmazenamento;
    }

    public void setModoArmazenamento(String modoArmazenamento) {
        this.modoArmazenamento = modoArmazenamento;
    }

//Construtor da classe alimento não perecível
    public AlimentoNaoPerecivel(String nome, Double quantidade, String localArmazenamento, LocalDate datacompra, LocalDate validade, String marca, String restricoesAlimentares, boolean organico, boolean enlatado, boolean embalagemVacuo, boolean selected, String modoArmazenamento) {
        super(nome, quantidade, localArmazenamento, datacompra, validade, marca, restricoesAlimentares, organico);
        this.enlatado = enlatado;
        this.embalagemVacuo = embalagemVacuo;
        this.modoArmazenamento = modoArmazenamento;
    }
}
