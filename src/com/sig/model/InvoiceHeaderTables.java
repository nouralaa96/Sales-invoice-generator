/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sig.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Nour Alaa
 */
public class InvoiceHeaderTables extends AbstractTableModel{

    private List<InvoiceHead> InvoiceList;
    private DateFormat DF= new SimpleDateFormat("dd-mm-yyyy");
    public List<InvoiceHead> getInvoiceList() {
        return InvoiceList;
    }

    public InvoiceHeaderTables(List<InvoiceHead> InvoiceList) {
    
        this.InvoiceList=InvoiceList;
    }


    
     

    @Override
    public int getRowCount() {
    
        return InvoiceList.size();
    }
    

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
         if(columnIndex==0) {
             return "Invoice Number";
         } else if(columnIndex==1){
            return "Customer Name";
        } else if(columnIndex==2) {
             return "Invoice Date";
         }else if (columnIndex==3) {
             return "Invoice Total";
         }else {
             return"";
         }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {

        if(columnIndex==0) {
            return Integer.class;
        } else if(columnIndex==1){
            return String.class;
        } else if(columnIndex==2) {
            return String.class;
        }else if (columnIndex==3) {
            return Double.class;
        }else {
            return Object.class;
        }

        
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
      
        return false;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        InvoiceHead row= InvoiceList.get(rowIndex);

        if(columnIndex==0) {
            return row.getNumber();
        } else if(columnIndex==1){
            return row.getCust();
        } else if(columnIndex==2) {
            return DF.format(row.getInDate());
        }else if (columnIndex==3) {
            return row.getInvoicegross();
        }else {
            return"";
        }

    }
    
}
