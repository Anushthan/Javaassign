/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                 Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of part: ");
            int number = sc.nextInt();
        System.out.println("Enter the description of item: ");
            String description = sc.next();
        System.out.println("Enter the quantity of item: ");
            int quantity = sc.nextInt();
            if(quantity < 0){
                quantity = 0;
            }
        System.out.println("Enter the price of item (per item): ");
            double price = sc.nextInt();
            if(price < 0){
                price = 0.0;
            }
       Invoice in = new Invoice(number, description, quantity, price);
       in.getInvoice();
       in.setInvoice();  
    } 
}

    
    

