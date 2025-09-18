package com.mycompany.View.ClassesBase;

import java.awt.Color;
import javax.swing.JButton;

public class ButtonBase extends JButton {
    public Color verdeEscuro = new Color(56, 61, 15);  

    public ButtonBase(String texto)
    {
        this.setText(texto);
        this.setForeground(PaletaCores.verdeEscuro);
        this.setBackground(Color.WHITE);
    }
}
