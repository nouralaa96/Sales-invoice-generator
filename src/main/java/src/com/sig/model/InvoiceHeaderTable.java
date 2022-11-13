/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.com.sig.model;

import javax.swing.table.AbstractTableModel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

public class InvoiceHeaderTable extends AbstractTableModel{

    private List<InvoiceHeader> InvoiceList;
    private DateFormat DF= new SimpleDateFormat("dd-mm-yyyy");
    
    public InvoiceHeaderTable(List<InvoiceHeader> InvoiceList) {
    
        this.InvoiceList=InvoiceList;
    }

    public List<InvoiceHeader> getInvoiceList() {
        return InvoiceList;
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
      
        switch(columnIndex){
            case 0: 
                return "Invoice Num";
            case 1: 
                 return "Customer Name";
            case 2:
                return "Invoice Date";
            case 3: 
                return "Invoice Total";
            default: 
                    return"";
                 
        }       
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
             switch(columnIndex){
            case 0: 
                return Integer.class;
            case 1: 
                 return String.class;
            case 2:
                return String.class;
            case 3: 
                return Double.class;
            default: 
                    return Object.class;
             }
        
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
      
        return false;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        InvoiceHeader r= InvoiceList.get(rowIndex);
        
        switch(columnIndex){
            case 0: 
                return r.getNum();
            case 1: 
                 return r.getCustomer();
            case 2:
                return DF.format(r.getInvDate());
            case 3: 
                return r.getInvoiceTotal();
            default: 
                    return"";
                 
        }       
        
        
    }
    
}
