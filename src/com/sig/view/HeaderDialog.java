/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sig.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Nour Alaa
 */
public class HeaderDialog extends JDialog{
    
    
    private JTextField NameField;
    private JTextField DateField;
    private JLabel NameLab;
    private JLabel DateLab;
    private JButton OK;
    private JButton Cancel;

    public HeaderDialog(InvoiceFrames f) {
        
        NameLab = new JLabel("Customer Name:");
        NameField = new JTextField(21);
        DateLab = new JLabel("Invoice Date:");
        DateField = new JTextField(21);
        OK = new JButton("OK");
        Cancel = new JButton("Cancel");
        
        
        OK.setActionCommand("OKCreateHeader");
        Cancel.setActionCommand("CancelCreateHeader");
        
         OK.addActionListener(f);
        Cancel.addActionListener(f);


        setLayout(new GridLayout(3, 2));

        add(NameField);
        add(OK);
        add(Cancel);
        add(DateLab);
        add(DateField);
        add(NameLab);
        pack();
        
        
    }

    public JTextField getNameField() {
        return NameField;
    }

    public JTextField getDateField() {
        return DateField;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
