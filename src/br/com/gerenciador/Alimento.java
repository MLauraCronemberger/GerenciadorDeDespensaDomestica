package br.com.gerenciador;
import java.time.LocalDate;

public class Alimento extends Produto {
    protected String restricoesAlimentares; // Ex: sem glúten, sem lactose
    protected boolean organico;
    protected boolean importado;

    public Alimento(String nome, Double quantidade, String localArmazenamento, LocalDate datacompra, LocalDate validade, String marca,String restricoesAlimentares, boolean organico, boolean importado) {
        super(nome, quantidade, localArmazenamento, datacompra, validade, marca);
        this.restricoesAlimentares = restricoesAlimentares;
        this.organico = organico;
        this.importado = importado;
    }

    @Override
    public String getCategoria() {
        return "Alimento";
    }
}
