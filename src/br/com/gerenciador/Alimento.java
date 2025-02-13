package br.com.gerenciador;
import java.time.LocalDate;

public class Alimento extends Produto {
    protected boolean organico; // Indica se o alimento é orgânico

    public boolean getOrganico() {
        return organico;
    }

    public void setOrganico(boolean organico) {
        this.organico = organico;
    }

    // Construtor atualizado (sem restricoesAlimentares)
    public Alimento(String nome, Double quantidade, String localArmazenamento, LocalDate datacompra,
                    LocalDate validade, String marca, boolean organico) {
        super(nome, quantidade, localArmazenamento, datacompra, validade, marca);
        this.organico = organico;
    }

    @Override
    public String getCategoria() {
        return "Alimento";
    }
}
