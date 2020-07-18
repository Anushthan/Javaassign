/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Dell
 */
public class Invoice extends JavaApplication1{
        public int number;
    public String description;
    public int quantity;
    public double price;
    
    public Invoice(int n, String desc, int qty, double pri){
        this.number = n;
        this.description = desc;
        this.quantity = qty;
        this.price = pri;
    }  
    public void getInvoice(){
            this.price = this.quantity * this.price; 
    }
    public void setInvoice(){
        System.out.println("The number is: " +this.number);
        System.out.println("The description is: " +this.description);
        System.out.println("The quantity of piece is: " +this.quantity);
        System.out.println("The total price of items is:" +this.price);
    }
}

