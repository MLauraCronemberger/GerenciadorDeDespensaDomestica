package br.com.gerenciador;

public class ProdutoHigiene extends Produto {
    protected String partedocorpo;

    public ProdutoHigiene(String partedocorpo) {
        this.partedocorpo = partedocorpo;
    }

    @Override
    public String getCategoria() {
        return "Higiene";
    }

    public String getPartedocorpo() {
        return partedocorpo;
    }

    public void setPartedocorpo(String partedocorpo) {
        this.partedocorpo = partedocorpo;
    }
}
