package br.com.gerenciador;
import java.time.LocalDate;

//Classe filha da classe Alimento
public class AlimentoPerecivel extends Alimento {
    protected boolean refrigerado;
    protected boolean congelado;

    //Polimorfismo- nessa classe o método getCategoria retorna "Alimento Perecível"
    @Override
    public String getCategoria() {
        return "Alimento Perecível";
    }

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

    //Construtor da classe- Alimento  Perecível
    public AlimentoPerecivel(String nome, Double quantidade, String localArmazenamento, LocalDate validade, String marca, String restricoesAlimentares, boolean refrigerado, boolean congelado, boolean selected) {
        super(nome, quantidade, localArmazenamento, validade, marca, restricoesAlimentares);
        this.refrigerado = refrigerado;
        this.congelado = congelado;
    }
}
