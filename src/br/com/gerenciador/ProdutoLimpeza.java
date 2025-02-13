package br.com.gerenciador;
import java.time.LocalDate;

public class ProdutoLimpeza extends Produto {
    protected boolean inflamavel;


    @Override
    public String getCategoria() {
        return "Limpeza";
    }

    public boolean isInflamavel() {
        return inflamavel;
    }

    public void setInflamavel(boolean inflamavel) {
        this.inflamavel = inflamavel;
    }

    public ProdutoLimpeza(String nome, Double quantidade, String localArmazenamento, LocalDate datacompra, LocalDate validade, String marca,boolean inflamavel) {
        super(nome, quantidade, localArmazenamento, datacompra, validade, marca);
        this.inflamavel = inflamavel;
    }
}

    
