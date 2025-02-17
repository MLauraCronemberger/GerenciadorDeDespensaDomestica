package br.com.gerenciador;

import java.time.LocalDate;

//Classe filha da classe Produto
public class ProdutoLimpeza extends Produto {

    protected boolean inflamavel;

//Polimorfismo- Nessa classe o método getCateagoria retorna
    @Override
    public String getCategoria() {
        return "Limpeza";
    }

//Método de inflamavel
    public boolean isInflamavel() {
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
