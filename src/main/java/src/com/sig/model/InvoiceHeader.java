/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.com.sig.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class InvoiceHeader {
    
   private int num;
   private String customer;
   private Date invDate;
   private ArrayList<InvoiceLine> lines;

    public InvoiceHeader() {
    }

    public InvoiceHeader(int num, String customer, Date invDate) {
        this.num = num;
        this.customer = customer;
        this.invDate = invDate;
        //this.lines = new ArrayList<>();
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Date getInvDate() {
        return invDate;
    }

    public void setInvDate(Date invDate) {
        this.invDate = invDate;
    }

    public ArrayList<InvoiceLine> getLines() {
        if(lines==null)
              lines = new ArrayList<>();

        return lines;
    }

    public void setLines(ArrayList<InvoiceLine> line) {
        this.lines = line;
    }












    public double getInvoiceTotal()
    {
        double total=0.0;
        for(InvoiceLine line: getLines())
        {
            total+=line.getLineTotal();
            
        }
        
        return total;
    }
    
    
     public void addInvoiceLine(InvoiceLine line) {
        getLines().add(line);
    }
     
         public String CSV()
    {
          DateFormat DF= new SimpleDateFormat("dd-MM-yyyy");
          
        return"" + getNum() + "," + DF.format(getInvDate()) + "," +  getCustomer();
    }           
            
     
    @Override
    public String toString() {
        String str = "InvoiceHeader{" + "invNum=" + num + ", customerName=" + customer + ", invDate=" + invDate + '}';
        for (InvoiceLine line : getLines()) {
            str += "\n\t" + line;
        }
        return str;
    }
    
    
}
