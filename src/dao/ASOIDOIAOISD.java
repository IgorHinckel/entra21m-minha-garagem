/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.swing.JFrame;
import javax.swing.JSpinner;

/**
 *
 * @author Alunos
 */
public class ASOIDOIAOISD extends JFrame {

    public static void main(String[] args) {

    }

    public void asoidnoasd() {
        setSize(600, 300);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        JSpinner spinner = new JSpinner();
        JSpinner.NumberEditor editor = new JSpinner.NumberEditor(jSpinnerAnoFabricacao);
editor.getFormat().setGroupingUsed(false);
editor.set
spinner.setEditor(editor);
    }
}
