package com.mycompany.View.ClassesBase;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LabelBase extends JLabel{
    public LabelBase(String text){
        this.setText(text);
        this.setForeground(PaletaCores.verdeEscuro);
        this.setBackground(PaletaCores.branco);
    }
}
