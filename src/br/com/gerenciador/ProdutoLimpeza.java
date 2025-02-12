package br.com.gerenciador;

//import java.time.LocalDate;

public class ProdutoLimpeza extends Produto {
    protected boolean inflamavel;
    protected String tipo; // Ex: desinfetante, detergente, sabão em pó

    public ProdutoLimpeza(boolean inflamavel, String tipo) {
        this.inflamavel = inflamavel;
        this.tipo = tipo;
    }

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
}

    
