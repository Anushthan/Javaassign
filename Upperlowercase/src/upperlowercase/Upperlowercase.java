/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upperlowercase;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Upperlowercase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in); 
        String str ;
        System.out.println("Enter  String:");
        str =input .nextLine();
        System.out.printf("%s%s",str .toUpperCase(), str.toLowerCase());
    }
    
}
