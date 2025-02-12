package br.com.gerenciador;

public class AlimentoNaoPerecivel extends Alimento {
    protected boolean enlatado;
    protected boolean embalagemVacuo;
    protected String modoArmazenamento; // Ex: lugar seco, fresco

    public AlimentoNaoPerecivel(String restricoesAlimentares, boolean organico, boolean importado) {
        super(restricoesAlimentares, organico, importado);
    }
}
