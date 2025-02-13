package br.com.gerenciador;
import java.time.LocalDate;

public class ProdutoLimpeza extends Produto {
    protected boolean inflamavel;
    protected String tipo; // Ex: desinfetante, detergente, sabão em pó

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ProdutoLimpeza(String nome, Double quantidade, String localArmazenamento, LocalDate datacompra, LocalDate validade, String marca,boolean inflamavel, String tipo) {
        super(nome, quantidade, localArmazenamento, datacompra, validade, marca);
        this.inflamavel = inflamavel;
        this.tipo = tipo;
    }
}

    
