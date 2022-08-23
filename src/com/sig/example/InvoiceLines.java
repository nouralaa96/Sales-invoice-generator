/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sig.example;

/**
 *
 * @author Nour Alaa
 */
public class InvoiceLines {
    
    private String item;
    private double price;
    private int counter;
    InvoiceHead header;

    public InvoiceLines() {
    }

    public InvoiceLines(String item, double price, int counter, InvoiceHead header) {
        
        this.item = item;
        this.price = price;
        this.counter = counter;
        this.header = header;
    }

    public int getCounter() {
        return counter;
    }



    public InvoiceHead getHeader() {
        return header;
    }

    public double getLineTotal()
    {
        return price* counter;
    }

    public String getItem() {
        return item;
    }

    public double getPrice() {
        return price;
    }

    public String CSV()
    {
        return"" + getHeader().getNumber() + "," + getItem() + "," + getPrice() + "," + getCounter();
    }           
            
    
       @Override
    public String toString() {
        return "InvoiceLine{" + "itemName=" + item + ", itemprice=" + price + ", itemCount=" + counter + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
