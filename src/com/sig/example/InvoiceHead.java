/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sig.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Nour Alaa
 */
public class InvoiceHead {
    
   private int number;
   private String customers;
   private Date inDate;
   private ArrayList<InvoiceLines> lines;

    public InvoiceHead() {
    }





    public String getCust() {
        return customers;
    }

    public Date getInDate() {
        return inDate;
    }
    public int getNumber() {
        return number;
    }

    public ArrayList<InvoiceLines> getLines() {

        if(lines==null) {
              lines = new ArrayList<>();  }

         return lines;
    }
    public String CSV()
    {
        DateFormat DF= new SimpleDateFormat("dd-MM-yyyy");

        return"" + getNumber() + "," + DF.format(getInDate()) + "," +  getCust();
    }
    public InvoiceHead(int number, String customer, Date invDate) {

        this.inDate = invDate;
        this.number = number;
        this.customers = customers;

    }


    public double getInvoicegross()
    {
        double gross=0.00;
        for(InvoiceLines line: getLines())
        {
            gross+=line.getLineTotal();
            
        }
        
        return gross;
    }
    
    


     
    @Override
    public String toString() {
        String string = "InvoiceHeader{" + "invNum=" + number + ", customerName=" + customers + ", invDate=" + inDate + '}';
        for (InvoiceLines line : getLines()) {
            string += "\n\t" + line;
        }
        return string;
    }

    public void addInvoiceLine(InvoiceLines line) {
        getLines().add(line);
    }

}
