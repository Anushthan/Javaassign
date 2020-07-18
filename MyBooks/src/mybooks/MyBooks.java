/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybooks;

/**
 *
 * @author Dell
 */
public class MyBooks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    Book test [] = new Book [30];
test[1]= new Book ("The Fifth Mountain","1020","Paulo Coelho","HarperCollins Publisher" );
        System.out.println(test[1].getBookInfo());
test[2]= new Book ("Maha ko Ma","1110","Madan Krishna Shrestha","Fine Print Publisher" );
       System.out.println(test[2].getBookInfo());
        
        
     }
    
}
