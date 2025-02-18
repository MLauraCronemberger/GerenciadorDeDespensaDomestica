package br.com.gerenciador;
import java.util.ArrayList;
import java.util.List;


//Classe responsável por gerenciar os produtos da despensa.
//Permite adicionar, remover, editar, listar e buscar produtos.

public class GerenciadorDeDespensa {

    //Lista de produtos armazenados na despensa.
    private List<Produto> produtos;


    //Construtor da classe GerenciadorDeDespensa.
    //Inicializa a lista de produtos.
    public GerenciadorDeDespensa() {
        this.produtos = new ArrayList<>();
    }

    //Retorna a lista de produtos armazenados na despensa.
    public List<Produto> getProdutos() {
        return produtos;
    }

    //Adiciona um produto à lista de produtos.
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado: " + produto.getNome());
    }

    //Remove um produto da lista de produtos pelo nome.
    //True se o produto foi removido com sucesso, False caso contrário
    public boolean removerProduto(String nome) {
        return produtos.removeIf(produto -> produto.getNome().equalsIgnoreCase(nome));
    }

    //Edita um produto existente na lista de produtos.
    //Busca o produto pelo nome e substitui pelo novo produto.
    //True se o produto foi editado com sucesso, False caso contrário
    public boolean editarProduto(String nomeAntigo, Produto novoProduto) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equalsIgnoreCase(nomeAntigo)) {
                produtos.set(i, novoProduto);
                return true;
            }
        }
        return false;
    }

    //Retorna uma lista com todos os produtos armazenados na despensa.
    public List<Produto> listarProdutos() {
        return new ArrayList<>(produtos);
    }

    //Busca um produto na lista de produtos pelo nome.
    public Produto buscarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }
}
