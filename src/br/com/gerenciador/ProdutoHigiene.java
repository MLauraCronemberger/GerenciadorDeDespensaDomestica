package br.com.gerenciador;
import java.time.LocalDate;

//Classe filha da classe Produto
public class ProdutoHigiene extends Produto {
    protected String parteDoCorpo;
    
    //Polimorfismo- nessa classe o método getCategoria retorna "Higiene"
    @Override
    public String getCategoria() {
        return "Produto de Higiene";
    }

    public String getPartedocorpo() {
        return parteDoCorpo;
    }

    public void setPartedocorpo(String partedocorpo) {
        this.parteDoCorpo = partedocorpo;
    }
    
    //Construtor da classe- ProdutoHigiene
    public ProdutoHigiene(String nome, Double quantidade, String localArmazenamento, LocalDate validade, String marca, String parteDoCorpo) {
        super(nome, quantidade, localArmazenamento, validade, marca);
        this.parteDoCorpo = parteDoCorpo;
    }
}
