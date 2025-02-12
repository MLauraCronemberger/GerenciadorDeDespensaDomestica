package br.com.gerenciador;

public class Alimento extends Produto {
    protected String restricoesAlimentares; // Ex: sem glúten, sem lactose
    protected boolean organico;
    protected boolean importado;

    public Alimento(String restricoesAlimentares, boolean organico, boolean importado) {
        this.restricoesAlimentares = restricoesAlimentares;
        this.organico = organico;
        this.importado = importado;
    }

    @Override
    public String getCategoria() {
        return "Alimento";
    }
}
