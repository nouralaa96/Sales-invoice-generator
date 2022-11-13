/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.com.sig.model;


public class InvoiceLine {
    
    private String item;
    private double price;
    private int count;
    InvoiceHeader header; 

    public InvoiceLine() {
    }

    public InvoiceLine(String item, double price, int count,InvoiceHeader header) {
        
        this.item = item;
        this.price = price;
        this.count = count;
        this.header = header;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }




    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public InvoiceHeader getHeader() {
        return header;
    }

    public void setHeader(InvoiceHeader header) {
        this.header = header;
    }

    
    public double getLineTotal()
    {
        return price*count;
    }
    
    
    public String CSV()
    {
        return"" + getHeader().getNum() + "," + getItem() + "," + getPrice() + "," + getCount();
    }           
            
    
       @Override
    public String toString() {
        return "InvoiceLine{" + "itemName=" + item + ", itemprice=" + price + ", itemCount=" + count + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
