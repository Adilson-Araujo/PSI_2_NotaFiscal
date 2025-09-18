package com.mycompany.View;

import com.mycompany.View.ClassesBase.LabelBase;
import com.mycompany.View.ClassesBase.ViewBase;
import com.mycompany.View.ClassesBase.ButtonBase;
import javax.swing.*;
import java.awt.*;

public class TelaCadastroAssociado extends ViewBase {
    // --- Informações Pessoais
    private JTextField txtNomeCompleto, txtApelido, txtCpf, txtRg, txtTelefone, txtEmail;

    // --- Endereço
    private JTextField txtAssentamento, txtLote, txtSetor, txtMunicipio, txtUf, txtCep, txtNumero;

    // --- Associado Produtor
    private JTextField txtCnpj, txtDap, txtCaf, txtPronaf, txtPaa, txtPnae;

    public TelaCadastroAssociado() {
        super();
        setTitle("Cadastro de Associado");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane abas = new JTabbedPane();
        abas.addTab("Informações Pessoais", criarPainelPessoal());
        abas.addTab("Endereço", criarPainelEndereco());
        abas.addTab("Associado Produtor", criarPainelProdutor());

        add(abas);
    }

    // Painel de Informações Pessoais
    private JPanel criarPainelPessoal() {
        JPanel p = new JPanel(new GridBagLayout());
        p.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        GridBagConstraints gbc = baseGbc();

        txtNomeCompleto = new JTextField(25);
        txtApelido = new JTextField(20);
        txtCpf = new JTextField(14);
        txtRg = new JTextField(12);
        txtTelefone = new JTextField(15);
        txtEmail = new JTextField(25);

        addField(p, gbc, 0, "Nome Completo:", txtNomeCompleto);
        addField(p, gbc, 1, "Apelido/Nome Social:", txtApelido);
        addField(p, gbc, 2, "CPF:", txtCpf);
        addField(p, gbc, 3, "RG:", txtRg);
        addField(p, gbc, 4, "Telefone:", txtTelefone);
        addField(p, gbc, 5, "E-mail:", txtEmail);
           
        addTopGlue(p, gbc, 11);
        return p;
    }

    // Painel de Endereço
    private JPanel criarPainelEndereco() {
        JPanel p = new JPanel(new GridBagLayout());
        p.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        GridBagConstraints gbc = baseGbc();

        txtAssentamento = new JTextField(20);
        txtLote = new JTextField(10);
        txtSetor = new JTextField(10);
        txtMunicipio = new JTextField(20);
        txtUf = new JTextField(2);
        txtCep = new JTextField(9);
        txtNumero = new JTextField(6);

        addField(p, gbc, 0, "Assentamento:", txtAssentamento);
        addField(p, gbc, 1, "Lote:", txtLote);
        addField(p, gbc, 2, "Setor:", txtSetor);
        addField(p, gbc, 3, "Município:", txtMunicipio);
        addField(p, gbc, 4, "UF:", txtUf);
        addField(p, gbc, 5, "CEP:", txtCep);
        addField(p, gbc, 6, "Número:", txtNumero);

        addTopGlue(p, gbc, 11);
        return p;
    }

    // Painel de Associado Produtor
    private JPanel criarPainelProdutor() {
        JPanel p = new JPanel(new GridBagLayout());
        p.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        GridBagConstraints gbc = baseGbc();

        txtCnpj = new JTextField(18);
        txtDap = new JTextField(15);
        txtCaf = new JTextField(15);
        txtPronaf = new JTextField(15);
        txtPaa = new JTextField(15);
        txtPnae = new JTextField(15);

        addField(p, gbc, 0, "CNPJ:", txtCnpj);
        addField(p, gbc, 1, "DAP:", txtDap);
        addField(p, gbc, 2, "CAF:", txtCaf);
        addField(p, gbc, 3, "PRONAF:", txtPronaf);
        addField(p, gbc, 4, "PAA:", txtPaa);
        addField(p, gbc, 5, "PNAE:", txtPnae);

        ButtonBase btnSalvar = new ButtonBase("Salvar Associado");
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        p.add(btnSalvar, gbc);

        addTopGlue(p, gbc, 11);
        return p;
    }

    // ===================== Utilitários =====================
    private GridBagConstraints baseGbc() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6, 6, 6, 6);
        gbc.anchor = GridBagConstraints.NORTHWEST; // esquerda/topo
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        return gbc;
    }

    private void addField(JPanel p, GridBagConstraints gbc, int y, String label, JTextField field) {
        gbc.gridy = y;
        gbc.gridx = 0;
        gbc.weightx = 0;
        p.add(new LabelBase(label), gbc);
        gbc.gridx = 1;
        gbc.weightx = 1.0;
        field.setPreferredSize(new Dimension(260, 26));
        p.add(field, gbc);
    }
    
    private void addTopGlue(JPanel p, GridBagConstraints gbc, int y) {
        gbc.gridx = 0; gbc.gridy = y; gbc.weighty = 1.0; gbc.fill = GridBagConstraints.BOTH;
        p.add(Box.createVerticalGlue(), gbc);
    }

    // ===================== Main (teste isolado) =====================
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaCadastroAssociado().setVisible(true));
    }
}
