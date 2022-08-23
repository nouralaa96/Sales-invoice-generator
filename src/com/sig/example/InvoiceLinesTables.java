/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sig.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * @author Nour Alaa
 */
public class InvoiceLinesTables extends AbstractTableModel {
    private List<InvoiceLines> invoiceLines;
    private final DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    public InvoiceLinesTables(List<InvoiceLines> invoiceLines) {
        this.invoiceLines = invoiceLines;
    }

    public List<InvoiceLines> getInvoiceLines() {
        return invoiceLines;
    }


    @Override
    public int getRowCount() {
        return invoiceLines.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {

        if (columnIndex == 0) {
            return "Item Name";
        } else if (columnIndex == 1) {
            return "Item Price";
        } else if (columnIndex == 2) {
            return "Count";
        } else if (columnIndex == 3) {
            return "Line Total";
        } else {
            return "";
        }

    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {

        if(columnIndex==0) {
            return String.class;
        } else if(columnIndex==1){
            return Double.class;
        } else if(columnIndex==2) {
            return Integer.class;
        }else if (columnIndex==3) {
            return Double.class;
        }else {
            return Object.class;
        }

    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceLines row = invoiceLines.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return row.getItem();
            case 1:
                return row.getPrice();
            case 2:
                return row.getCounter();
            case 3:
                return row.getLineTotal();
            default:
                return "";
        }

    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
}
