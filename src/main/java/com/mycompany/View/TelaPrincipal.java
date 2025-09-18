package com.mycompany.View;

import com.mycompany.View.ClassesBase.PaletaCores;
import com.mycompany.View.ClassesBase.ViewBase;
import com.mycompany.View.ClassesBase.ButtonBase;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TelaPrincipal extends ViewBase {
    private CardLayout cardLayout;
    private JPanel painelCentral;

    public TelaPrincipal() {
        setTitle("Sistema de Notas Fiscais");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        

        // Painel superior com botões pequenos
        var menuSuperior = new JPanel();
        menuSuperior.setLayout(new GridBagLayout());
        menuSuperior.setBackground(PaletaCores.verdeEscuro);
        var tamanhoHeader = new Dimension(1200, 100);
        menuSuperior.setPreferredSize(tamanhoHeader);
        
        var btnCadastroVenda = new ButtonBase("Cadastro de Venda");
        var btnGerarNfVenda = new ButtonBase("Gerar NF de Venda");
        var btnCadastrarAssociado = new ButtonBase("Cadastrar Associado");
        
        var botoes = new ArrayList<ButtonBase>();
        botoes.add(btnCadastrarAssociado);
        botoes.add(btnCadastroVenda);
        botoes.add(btnGerarNfVenda);
        
         // Área central com CardLayout
        cardLayout = new CardLayout();
        painelCentral = new JPanel(cardLayout);
        
        // Definir tamanho dos botoões
        Dimension tamanhoBotao = new Dimension(200, 30);      
        for (var botao : botoes)
        {
            botao.setPreferredSize(tamanhoBotao);
            menuSuperior.add(botao);
        }
        
        // Adicionar telas existentes
        painelCentral.add(new TelaCadastroAssociado().getContentPane(), "CADASTRO ASSOCIADO");
        painelCentral.add(new TelaCadastroVenda().getContentPane(), "CADASTRO NFE");
        painelCentral.add(new TelaGerarNotaFiscalVenda().getContentPane(), "GERAR");

        // Ações dos botões
        btnCadastroVenda.addActionListener(e -> cardLayout.show(painelCentral, "CADASTRO NFE"));
        btnGerarNfVenda.addActionListener(e -> cardLayout.show(painelCentral, "GERAR"));
        btnCadastrarAssociado.addActionListener(e -> cardLayout.show(painelCentral, "CADASTRO ASSOCIADO"));

        // Layout principal
        setLayout(new BorderLayout());
        add(menuSuperior, BorderLayout.NORTH);
        add(painelCentral, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaPrincipal().setVisible(true));
    }
}
