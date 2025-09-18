package com.mycompany.View.ClassesBase;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Label extends JLabel{
    public Label(String text){
        this.setText(text);
        this.setForeground(PaletaCores.verdeEscuro);
        this.setBackground(PaletaCores.branco);
    }
}
