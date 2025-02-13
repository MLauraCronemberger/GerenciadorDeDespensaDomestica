package br.com.gerenciador;
import java.time.LocalDate;

public class ProdutoHigiene extends Produto {
    protected String parteDoCorpo;

    @Override
    public String getCategoria() {
        return "Higiene";
    }

    public String getPartedocorpo() {
        return parteDoCorpo;
    }

    public void setPartedocorpo(String partedocorpo) {
        this.parteDoCorpo = partedocorpo;
    }

    public ProdutoHigiene(String nome, Double quantidade, String localArmazenamento, LocalDate datacompra, LocalDate validade, String marca, String parteDoCorpo) {
        super(nome, quantidade, localArmazenamento, datacompra, validade, marca);
        this.parteDoCorpo = parteDoCorpo;
    }
}
