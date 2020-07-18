/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestvalue;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Largestvalue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                  int largest;
        Scanner input = new Scanner(System.in);
       System.out.println("Enter 10 integer numbers:");
       int number[] = new int[10];
       for(int counter = 0; counter < 10; counter++){
            number[counter] = input.nextInt();
       }
       largest = number[0];
       for(int counter = 0; counter < 10; counter++){
        if(largest < number[counter]){
            largest = number[counter];
        }
    } System.out.println("Largest number is: " +largest);
          } 
    }

    
    

