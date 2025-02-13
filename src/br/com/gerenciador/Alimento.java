package br.com.gerenciador;
import java.time.LocalDate;

public class Alimento extends Produto {
    protected String restricoesAlimentares; // Ex: sem glúten, sem lactose
    protected boolean organico;

    public String getRestricoesAlimentares() {
        return restricoesAlimentares;
    }

    public void setRestricoesAlimentares(String restricoesAlimentares) {
        this.restricoesAlimentares = restricoesAlimentares;
    }

    public boolean getOrganico() {
        return organico;
    }

    public void setOrganico(boolean organico) {
        this.organico = organico;
    }

        public Alimento(String nome, Double quantidade, String localArmazenamento, LocalDate datacompra, LocalDate validade, String marca,String restricoesAlimentares, boolean organico) {
        super(nome, quantidade, localArmazenamento, datacompra, validade, marca);
        this.restricoesAlimentares = restricoesAlimentares;
        this.organico = organico;

    }

    @Override
    public String getCategoria() {
        return "Alimento";
    }
}
