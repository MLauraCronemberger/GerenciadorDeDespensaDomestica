package br.com.gerenciador;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeDespensa {
    private List<Produto> produtos; // Lista para armazenar os produtos

    public GerenciadorDeDespensa() {
        this.produtos = new ArrayList<>();
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    // Método para adicionar um produto
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado: " + produto.getNome());
    }

    // Método para remover um produto pelo nome
    public boolean removerProduto(String nome) {
        return produtos.removeIf(produto -> produto.getNome().equalsIgnoreCase(nome));
    }

    // Editar Produto (busca pelo nome e substitui)
    public boolean editarProduto(String nomeAntigo, Produto novoProduto) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equalsIgnoreCase(nomeAntigo)) {
                produtos.set(i, novoProduto);
                return true;
            }
        }
        return false;
    }

    // Método para listar todos os produtos
    public List<Produto> listarProdutos() {
        return new ArrayList<>(produtos);
    }

    public List<Produto> listarPorCategoria(String categoria) {
        List<Produto> filtrados = new ArrayList<>();
        for (Produto p : produtos) {
            if (p.getCategoria().equalsIgnoreCase(categoria)) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    // Método para buscar um produto pelo nome
    public Produto buscarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }
}

