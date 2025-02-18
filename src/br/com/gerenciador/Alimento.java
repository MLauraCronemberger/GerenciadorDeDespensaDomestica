package br.com.gerenciador;
import java.time.LocalDate;

//Classe filha da classe Produto
public class Alimento extends Produto {
    protected String restricoesAlimentares;

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

    //Construtor da classe Alimento.
    public Alimento(String nome, Double quantidade, String localArmazenamento, LocalDate validade, String marca, String restricoesAlimentares) {
        super(nome, quantidade, localArmazenamento, validade, marca);
        this.restricoesAlimentares = restricoesAlimentares;
    }

}
