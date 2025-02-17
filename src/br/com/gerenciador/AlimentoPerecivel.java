package br.com.gerenciador;
import java.time.LocalDate;

//Classe filha da classe Alimento
public class AlimentoPerecivel extends Alimento {
    protected boolean refrigerado;
    protected boolean congelado;
    protected LocalDate dataFabricacao;

//Gets e Sets dos atributos
//Get e Set- Refrigerado
    public boolean getRefrigerado() {
        return refrigerado;
    }

    public void setRefrigerado(boolean refrigerado) {
        this.refrigerado = refrigerado;
    }

//Get e Set- Congelado
    public boolean getCongelado() {
        return congelado;
    }

    public void setCongelado(boolean congelado) {
        this.congelado = congelado;
    }

//Get e Set- Data de Fabricacao
    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }


    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

//Construtor da classe- Alimento  Perecível
    public AlimentoPerecivel(String nome, Double quantidade, String localArmazenamento, LocalDate datacompra, LocalDate validade, String marca, String restricoesAlimentares, boolean organico, boolean refrigerado, boolean congelado, boolean selected, LocalDate dataFabricacao) {
        super(nome, quantidade, localArmazenamento, datacompra, validade, marca, restricoesAlimentares, organico);
        this.refrigerado = refrigerado;
        this.congelado = congelado;
        this.dataFabricacao = dataFabricacao;
    }
}
