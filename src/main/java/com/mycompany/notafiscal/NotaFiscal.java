/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notafiscal;

import javax.swing.SwingUtilities;

/**
 *
 * @author aaraujo31
 */
public class NotaFiscal {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Form1().setVisible(true);
        });
        
    }
}
