package br.com.gerenciador;
import java.time.LocalDate;

public class AlimentoPerecivel extends Alimento {
    protected boolean refrigerado; // Se precisa de geladeira
    protected boolean congelado;
    protected LocalDate dataFabricacao;

    public AlimentoPerecivel(String nome, Double quantidade, String localArmazenamento, LocalDate datacompra, LocalDate validade, String marca, String restricoesAlimentares, boolean organico, boolean importado, boolean refrigerado, boolean congelado, LocalDate dataFabricacao) {
        super(nome, quantidade, localArmazenamento, datacompra, validade, marca, restricoesAlimentares, organico, importado);
        this.refrigerado = refrigerado;
        this.congelado = congelado;
        this.dataFabricacao = dataFabricacao;
    }
}




    
    
