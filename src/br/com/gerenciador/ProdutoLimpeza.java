package br.com.gerenciador;

import java.time.LocalDate;

//Classe filha da classe Produto
public class ProdutoLimpeza extends Produto {

    protected boolean inflamavel;

    //Polimorfismo- Nessa classe o método getCateagoria retorna Produto de Limpeza
    @Override
    public String getCategoria() {
        return "Produto de Limpeza";
    }

    public boolean getInflamavel() {
        return inflamavel;
    }

    public void setInflamavel(boolean inflamavel) {
        this.inflamavel = inflamavel;
    }

    //Construtor da classe ProdutoLimpeza.
    public ProdutoLimpeza(String nome, Double quantidade, String localArmazenamento, LocalDate datacompra, LocalDate validade, String marca, boolean inflamavel) {
        super(nome, quantidade, localArmazenamento, datacompra, validade, marca);
        this.inflamavel = inflamavel;
    }
}
