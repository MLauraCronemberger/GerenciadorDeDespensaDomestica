package br.com.gerenciador;
import java.time.LocalDate;

public class AlimentoPerecivel extends Alimento {
    protected boolean refrigerado; // Se precisa de geladeira
    protected boolean congelado;
    protected LocalDate dataFabricacao;

    public boolean getRefrigerado() {
        return refrigerado;
    }

    public void setRefrigerado(boolean refrigerado) {
        this.refrigerado = refrigerado;
    }

    public boolean getCongelado() {
        return congelado;
    }

    public void setCongelado(boolean congelado) {
        this.congelado = congelado;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }



    public AlimentoPerecivel(String nome, Double quantidade, String localArmazenamento, LocalDate datacompra, LocalDate validade, String marca, String restricoesAlimentares, boolean organico, boolean refrigerado, boolean congelado, LocalDate dataFabricacao) {
        super(nome, quantidade, localArmazenamento, datacompra, validade, marca, restricoesAlimentares, organico);
        this.refrigerado = refrigerado;
        this.congelado = congelado;
        this.dataFabricacao = dataFabricacao;
    }
}




    
    
