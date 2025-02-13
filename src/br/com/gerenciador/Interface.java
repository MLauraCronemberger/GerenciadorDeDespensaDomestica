package br.com.gerenciador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;

public class Interface extends JFrame {
    private GerenciadorDeDespensa gerenciador;
    private JTextField campoNome, campoQuantidade, campoLocal, campoMarca, campoValidade;
    private JComboBox<String> categoriaBox;
    private JTextArea areaExibicao;

    public Interface() {
        gerenciador = new GerenciadorDeDespensa();

        setTitle("Gerenciador de Despensa");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));

        // Campos de entrada
        add(new JLabel("Nome:"));
        campoNome = new JTextField();
        add(campoNome);

        add(new JLabel("Quantidade:"));
        campoQuantidade = new JTextField();
        add(campoQuantidade);

        add(new JLabel("Local Armazenamento:"));
        campoLocal = new JTextField();
        add(campoLocal);

        add(new JLabel("Marca:"));
        campoMarca = new JTextField();
        add(campoMarca);

        add(new JLabel("Validade (AAAA-MM-DD):"));
        campoValidade = new JTextField();
        add(campoValidade);

        // Escolher categoria do produto
        add(new JLabel("Categoria:"));
        String[] categorias = {"Alimento", "Produto de Higiene", "Produto de Limpeza"};
        categoriaBox = new JComboBox<>(categorias);
        add(categoriaBox);

        // Botão Adicionar
        JButton botaoAdicionar = new JButton("Adicionar Produto");
        add(botaoAdicionar);
        botaoAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarProduto();
            }
        });

        // Botão Listar
        JButton botaoListar = new JButton("Listar Produtos");
        add(botaoListar);
        botaoListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarProdutos();
            }
        });

        // Área de exibição
        areaExibicao = new JTextArea();
        areaExibicao.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(areaExibicao);
        add(scrollPane);

        setVisible(true);
    }

    // Método para adicionar produto com base na categoria escolhida
    private void adicionarProduto() {
        String nome = campoNome.getText();
        double quantidade = Double.parseDouble(campoQuantidade.getText());
        String local = campoLocal.getText();
        String marca = campoMarca.getText();
        LocalDate validade = LocalDate.parse(campoValidade.getText());

        String categoriaSelecionada = (String) categoriaBox.getSelectedItem();
        Produto produto = null;

        switch (categoriaSelecionada) {
            case "Alimento":
                produto = new Alimento(nome, quantidade, local, LocalDate.now(), validade, marca, "Sem restrições", false);
                break;
            case "Produto de Higiene":
                produto = new ProdutoHigiene(nome, quantidade, local, LocalDate.now(), validade, marca, "Cabelo");
                break;
            case "Produto de Limpeza":
                produto = new ProdutoLimpeza(nome, quantidade, local, LocalDate.now(), validade, marca, true, "Desinfetante");
                break;
        }

        if (produto != null) {
            gerenciador.adicionarProduto(produto);
            JOptionPane.showMessageDialog(this, "Produto adicionado com sucesso!");
        }
    }

    // Método para listar produtos na área de exibição
    private void listarProdutos() {
        areaExibicao.setText("");
        List<Produto> produtos = gerenciador.listarProdutos();
        for (Produto p : produtos) {
            areaExibicao.append(p.getNome() + " - " + p.getLocalArmazenamento() + " - " + p.getCategoria() + "\n");
        }
    }

    public static void main(String[] args) {
        new Interface();
    }
}
