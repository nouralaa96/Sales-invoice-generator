/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sig.viewing;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Nour Alaa
 */
public class LineDialog extends JDialog{
   
    private JTextField NameF;
    private JTextField CountF;
    private JTextField PriceF;
    private JLabel NameL;
    private JLabel CountL;
    private JLabel PriceL;
    private JButton OK;
    private JButton Cancel;
    
    public LineDialog(InvoiceFrames f) {
        NameF = new JTextField(20);
        NameL = new JLabel("Item Name");
        
        CountF = new JTextField(20);
        CountL = new JLabel("Item Count");
        
        PriceF = new JTextField(20);
        PriceL = new JLabel("Item Price");
        
        OK = new JButton("OK");
        Cancel = new JButton("Cancel");
        
        OK.setActionCommand("OKCreateLine");
        Cancel.setActionCommand("CancelCreateLine");
        
        OK.addActionListener(f);
        Cancel.addActionListener(f);
        setLayout(new GridLayout(4, 2));
        
        add(NameL);
        add(NameF);
        add(CountL);
        add(CountF);
        add(PriceL);
        add(PriceF);
        add(OK);
        add(Cancel);
        
        pack();
    }

    public JTextField getNameF() {
        return NameF;
    }

    public JTextField getCountF() {
        return CountF;
    }

    public JTextField getPriceF() {
        return PriceF;
    }

    
    
    
    
}
