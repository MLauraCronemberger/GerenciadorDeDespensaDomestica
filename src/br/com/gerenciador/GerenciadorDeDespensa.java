package br.com.gerenciador;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por gerenciar os produtos da despensa.
 * Permite adicionar, remover, editar, listar e buscar produtos.
 */
public class GerenciadorDeDespensa {
    /**
     * Lista de produtos armazenados na despensa.
     */
    private List<Produto> produtos;

    /**
     * Construtor da classe GerenciadorDeDespensa.
     * Inicializa a lista de produtos.
     */
    public GerenciadorDeDespensa() {
        this.produtos = new ArrayList<>();
    }

    /**
     * Retorna a lista de produtos armazenados na despensa.
     *
     * @return A lista de produtos.
     */
    public List<Produto> getProdutos() {
        return produtos;
    }

    /**
     * Adiciona um produto à lista de produtos.
     *
     * @param produto O produto a ser adicionado.
     */
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado: " + produto.getNome());
    }

    /**
     * Remove um produto da lista de produtos pelo nome.
     *
     * @param nome O nome do produto a ser removido.
     * @return {@code true} se o produto foi removido com sucesso, {@code false} caso contrário.
     */
    public boolean removerProduto(String nome) {
        return produtos.removeIf(produto -> produto.getNome().equalsIgnoreCase(nome));
    }

    /**
     * Edita um produto existente na lista de produtos.
     * Busca o produto pelo nome e substitui pelo novo produto.
     *
     * @param nomeAntigo O nome do produto a ser editado.
     * @param novoProduto O novo produto que substituirá o antigo.
     * @return {@code true} se o produto foi editado com sucesso, {@code false} caso contrário.
     */
    public boolean editarProduto(String nomeAntigo, Produto novoProduto) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equalsIgnoreCase(nomeAntigo)) {
                produtos.set(i, novoProduto);
                return true;
            }
        }
        return false;
    }

    /**
     * Retorna uma lista com todos os produtos armazenados na despensa.
     *
     * @return Uma lista contendo todos os produtos.
     */
    public List<Produto> listarProdutos() {
        return new ArrayList<>(produtos);
    }

    /**
     * Retorna uma lista de produtos filtrados por categoria.
     *
     * @param categoria A categoria dos produtos a serem filtrados.
     * @return Uma lista contendo os produtos da categoria especificada.
     */
    public List<Produto> listarPorCategoria(String categoria) {
        List<Produto> filtrados = new ArrayList<>();
        for (Produto p : produtos) {
            if (p.getCategoria().equalsIgnoreCase(categoria)) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    /**
     * Busca um produto na lista de produtos pelo nome.
     *
     * @param nome O nome do produto a ser buscado.
     * @return O produto encontrado ou {@code null} se nenhum produto for encontrado.
     */
    public Produto buscarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }
}
