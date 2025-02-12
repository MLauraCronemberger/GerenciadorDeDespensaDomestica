package br.com.gerenciador;
import java.time.LocalDate;

public class AlimentoPereciveis extends Alimento {
    protected boolean refrigerado; // Se precisa de geladeira
    protected boolean congelado;
    protected LocalDate dataFabricacao;

    public AlimentoPereciveis(String restricoesAlimentares, boolean organico, boolean importado) {
        super(restricoesAlimentares, organico, importado);
    }
}




    
    
