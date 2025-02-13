package br.com.gerenciador;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;

public class Interface extends JFrame {
    private GerenciadorDeDespensa gerenciador;
    private JPanel mainPanel, formPanel, buttonPanel, listPanel;
    private JTextField campoNome, campoQuantidade, campoLocal, campoMarca, campoValidade;
    private JComboBox<String> categoriaBox;
    private JCheckBox checkRefrigerado, checkCongelado, checkEnlatado, checkEmbalagemVacuo, checkOrganico;
    private JTextField campoRestricoesAlimentares, campoParteCorpo, campoTipoLimpeza;
    private JCheckBox checkInflamavel;
    private JList<String> produtosList;
    private DefaultListModel<String> listModel;
    private JButton btnAdicionar, btnEditar, btnRemover, btnLimpar;
    private CardLayout cardLayout;
    private JPanel camposEspecificosPanel;

    public Interface() {
        gerenciador = new GerenciadorDeDespensa();
        configureFrame();
        createPanels();
        createBasicFields();
        createSpecificFields();
        createButtons();
        createList();
        layoutComponents();
        addListeners();
    }

    private void configureFrame() {
        setTitle("Gerenciador de Despensa");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void createPanels() {
        mainPanel = new JPanel(new BorderLayout(10, 10));
        formPanel = new JPanel(new GridBagLayout());
        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        listPanel = new JPanel(new BorderLayout());

        cardLayout = new CardLayout();
        camposEspecificosPanel = new JPanel(cardLayout);

        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setContentPane(mainPanel);
    }

    private void createBasicFields() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        campoNome = new JTextField(20);
        campoQuantidade = new JTextField(20);
        campoLocal = new JTextField(20);
        campoMarca = new JTextField(20);
        campoValidade = new JTextField(20);

        String[] categorias = {"Alimento Perecível", "Alimento Não Perecível",
                "Produto de Higiene", "Produto de Limpeza"};
        categoriaBox = new JComboBox<>(categorias);

        addFormField(formPanel, "Nome:", campoNome, gbc, 0);
        addFormField(formPanel, "Quantidade:", campoQuantidade, gbc, 1);
        addFormField(formPanel, "Local:", campoLocal, gbc, 2);
        addFormField(formPanel, "Marca:", campoMarca, gbc, 3);
        addFormField(formPanel, "Validade (AAAA-MM-DD):", campoValidade, gbc, 4);
        addFormField(formPanel, "Categoria:", categoriaBox, gbc, 5);
    }

    private void addFormField(JPanel panel, String label, JComponent component,
                              GridBagConstraints gbc, int row) {
        gbc.gridx = 0;
        gbc.gridy = row;
        panel.add(new JLabel(label), gbc);

        gbc.gridx = 1;
        gbc.gridy = row;
        panel.add(component, gbc);
    }

    private void createSpecificFields() {
        // Campos para Alimento Perecível
        JPanel perecivelPanel = new JPanel(new GridLayout(0, 1, 5, 5));
        checkRefrigerado = new JCheckBox("Refrigerado");
        checkCongelado = new JCheckBox("Congelado");
        checkOrganico = new JCheckBox("Orgânico");
        campoRestricoesAlimentares = new JTextField(20);
        perecivelPanel.add(checkRefrigerado);
        perecivelPanel.add(checkCongelado);
        perecivelPanel.add(checkOrganico);
        perecivelPanel.add(new JLabel("Restrições Alimentares:"));
        perecivelPanel.add(campoRestricoesAlimentares);

        // Campos para Alimento Não Perecível
        JPanel naoPerecivelPanel = new JPanel(new GridLayout(0, 1, 5, 5));
        checkEnlatado = new JCheckBox("Enlatado");
        checkEmbalagemVacuo = new JCheckBox("Embalagem a Vácuo");
        naoPerecivelPanel.add(checkEnlatado);
        naoPerecivelPanel.add(checkEmbalagemVacuo);
        naoPerecivelPanel.add(checkOrganico);
        naoPerecivelPanel.add(new JLabel("Restrições Alimentares:"));
        naoPerecivelPanel.add(campoRestricoesAlimentares);

        // Campos para Produto de Higiene
        JPanel higienePanel = new JPanel(new GridLayout(0, 1, 5, 5));
        campoParteCorpo = new JTextField(20);
        higienePanel.add(new JLabel("Parte do Corpo:"));
        higienePanel.add(campoParteCorpo);

        // Campos para Produto de Limpeza
        JPanel limpezaPanel = new JPanel(new GridLayout(0, 1, 5, 5));
        checkInflamavel = new JCheckBox("Inflamável");
        campoTipoLimpeza = new JTextField(20);
        limpezaPanel.add(checkInflamavel);
        limpezaPanel.add(new JLabel("Tipo de Produto:"));
        limpezaPanel.add(campoTipoLimpeza);

        camposEspecificosPanel.add(perecivelPanel, "Alimento Perecível");
        camposEspecificosPanel.add(naoPerecivelPanel, "Alimento Não Perecível");
        camposEspecificosPanel.add(higienePanel, "Produto de Higiene");
        camposEspecificosPanel.add(limpezaPanel, "Produto de Limpeza");
    }

    private void createButtons() {
        btnAdicionar = new JButton("Adicionar");
        btnEditar = new JButton("Editar");
        btnRemover = new JButton("Remover");
        btnLimpar = new JButton("Limpar Campos");

        buttonPanel.add(btnAdicionar);
        buttonPanel.add(btnEditar);
        buttonPanel.add(btnRemover);
        buttonPanel.add(btnLimpar);
    }

    private void createList() {
        listModel = new DefaultListModel<>();
        produtosList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(produtosList);
        scrollPane.setPreferredSize(new Dimension(300, 400));
        listPanel.add(scrollPane, BorderLayout.CENTER);
        listPanel.setBorder(BorderFactory.createTitledBorder("Produtos"));
    }

    private void layoutComponents() {
        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.add(formPanel, BorderLayout.NORTH);
        leftPanel.add(camposEspecificosPanel, BorderLayout.CENTER);
        leftPanel.add(buttonPanel, BorderLayout.SOUTH);

        mainPanel.add(leftPanel, BorderLayout.WEST);
        mainPanel.add(listPanel, BorderLayout.CENTER);
    }

    private void addListeners() {
        categoriaBox.addActionListener(e -> {
            String selectedCategory = (String) categoriaBox.getSelectedItem();
            cardLayout.show(camposEspecificosPanel, selectedCategory);
        });

        btnAdicionar.addActionListener(e -> adicionarProduto());
        btnEditar.addActionListener(e -> editarProduto());
        btnRemover.addActionListener(e -> removerProduto());
        btnLimpar.addActionListener(e -> limparCampos());

        atualizarListaProdutos();
    }

    private void adicionarProduto() {
        try {
            String nome = campoNome.getText();
            double quantidade = Double.parseDouble(campoQuantidade.getText());
            String local = campoLocal.getText();
            String marca = campoMarca.getText();
            LocalDate validade = LocalDate.parse(campoValidade.getText());
            LocalDate dataCompra = LocalDate.now();

            String categoriaSelecionada = (String) categoriaBox.getSelectedItem();
            Produto produto = null;

            switch (categoriaSelecionada) {
                case "Alimento Perecível":
                    produto = new AlimentoPerecivel(
                            nome, quantidade, local, dataCompra, validade, marca,
                            campoRestricoesAlimentares.getText(), checkOrganico.isSelected(),
                            checkRefrigerado.isSelected(), checkCongelado.isSelected(),
                            false, dataCompra
                    );
                    break;
                case "Alimento Não Perecível":
                    produto = new AlimentoNaoPerecivel(
                            nome, quantidade, local, dataCompra, validade, marca,
                            campoRestricoesAlimentares.getText(), checkOrganico.isSelected(),
                            checkEnlatado.isSelected(), checkEmbalagemVacuo.isSelected(),
                            false, "Lugar seco"
                    );
                    break;
                case "Produto de Higiene":
                    produto = new ProdutoHigiene(
                            nome, quantidade, local, dataCompra, validade, marca,
                            campoParteCorpo.getText()
                    );
                    break;
                case "Produto de Limpeza":
                    produto = new ProdutoLimpeza(
                            nome, quantidade, local, dataCompra, validade, marca,
                            checkInflamavel.isSelected(), campoTipoLimpeza.getText()
                    );
                    break;
            }

            if (produto != null) {
                gerenciador.adicionarProduto(produto);
                limparCampos();
                atualizarListaProdutos();
                JOptionPane.showMessageDialog(this, "Produto adicionado com sucesso!");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Quantidade inválida!");
        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(this, "Data inválida! Use o formato AAAA-MM-DD");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao adicionar produto: " + ex.getMessage());
        }
    }

    private void editarProduto() {
        String selectedValue = produtosList.getSelectedValue();
        if (selectedValue == null) {
            JOptionPane.showMessageDialog(this, "Selecione um produto para editar!");
            return;
        }

        String nome = selectedValue.split(" - ")[0];
        Produto produto = gerenciador.buscarProduto(nome);
        if (produto != null) {
            preencherCamposComProduto(produto);
            // Remove o produto antigo para ser substituído pelo editado
            gerenciador.removerProduto(nome);
        }
    }

    private void removerProduto() {
        String selectedValue = produtosList.getSelectedValue();
        if (selectedValue == null) {
            JOptionPane.showMessageDialog(this, "Selecione um produto para remover!");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Tem certeza que deseja remover este produto?",
                "Confirmar Remoção",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {
            String nome = selectedValue.split(" - ")[0];
            if (gerenciador.removerProduto(nome)) {
                atualizarListaProdutos();
                limparCampos();
                JOptionPane.showMessageDialog(this, "Produto removido com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao remover produto!");
            }
        }
    }

    private void preencherCamposComProduto(Produto produto) {
        campoNome.setText(produto.getNome());
        campoQuantidade.setText(String.valueOf(produto.getQuantidade()));
        campoLocal.setText(produto.getLocalArmazenamento());
        campoMarca.setText(produto.getMarca());
        campoValidade.setText(produto.getValidade().toString());

        if (produto instanceof AlimentoPerecivel) {
            AlimentoPerecivel ap = (AlimentoPerecivel) produto;
            categoriaBox.setSelectedItem("Alimento Perecível");
            checkRefrigerado.setSelected(ap.getRefrigerado());
            checkCongelado.setSelected(ap.getCongelado());
            checkOrganico.setSelected(((Alimento) ap).getOrganico());
            campoRestricoesAlimentares.setText(((Alimento) ap).getRestricoesAlimentares());
        } else if (produto instanceof AlimentoNaoPerecivel) {
            AlimentoNaoPerecivel anp = (AlimentoNaoPerecivel) produto;
            categoriaBox.setSelectedItem("Alimento Não Perecível");
            checkEnlatado.setSelected(anp.getEnlatado());
            checkEmbalagemVacuo.setSelected(anp.getEmbalagemVacuo());
            checkOrganico.setSelected(((Alimento) anp).getOrganico());
            campoRestricoesAlimentares.setText(((Alimento) anp).getRestricoesAlimentares());
        } else if (produto instanceof ProdutoHigiene) {
            ProdutoHigiene ph = (ProdutoHigiene) produto;
            categoriaBox.setSelectedItem("Produto de Higiene");
            campoParteCorpo.setText(ph.getPartedocorpo());
        } else if (produto instanceof ProdutoLimpeza) {
            ProdutoLimpeza pl = (ProdutoLimpeza) produto;
            categoriaBox.setSelectedItem("Produto de Limpeza");
            checkInflamavel.setSelected(pl.isInflamavel());
            campoTipoLimpeza.setText(pl.getTipo());
        }
    }

    private void atualizarListaProdutos() {
        listModel.clear();
        List<Produto> produtos = gerenciador.listarProdutos();
        for (Produto p : produtos) {
            listModel.addElement(p.getNome() + " - " + p.getCategoria());
        }
    }

    private void limparCampos() {
        campoNome.setText("");
        campoQuantidade.setText("");
        campoLocal.setText("");
        campoMarca.setText("");
        campoValidade.setText("");
        campoRestricoesAlimentares.setText("");
        campoParteCorpo.setText("");
        campoTipoLimpeza.setText("");

        // Limpar checkboxes
        checkRefrigerado.setSelected(false);
        checkCongelado.setSelected(false);
        checkEnlatado.setSelected(false);
        checkEmbalagemVacuo.setSelected(false);
        checkOrganico.setSelected(false);
        checkInflamavel.setSelected(false);

        // Resetar para a primeira categoria
        categoriaBox.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        // Garantir que a interface seja criada na Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            try {
                // Definir o Look and Feel do sistema
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            new Interface().setVisible(true);
        });
    }
}