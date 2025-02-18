package br.com.gerenciador;
import java.time.LocalDate;

//Classe filha da classe Produto
public class Alimento extends Produto {
    protected String restricoesAlimentares;
    protected boolean organico;

    //Polimorfismo- nessa classe o método getCategoria retorna "Alimento"
    @Override
    public String getCategoria() {
        return "Alimento";
    }

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

    //Construtor da classe Alimento.
    public Alimento(String nome, Double quantidade, String localArmazenamento, LocalDate datacompra, LocalDate validade, String marca, String restricoesAlimentares, boolean organico) {
        super(nome, quantidade, localArmazenamento, datacompra, validade, marca);
        this.restricoesAlimentares = restricoesAlimentares;
        this.organico = organico;
    }

}
