/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimalformat;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class DecimalFormat {

     static void average(float s){
        float avg = 0;
        for(int i = 0; i < 20; i++){
         avg = s/i;   
        }
        System.out.format("The average is: %.2f \n", avg);
    }
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
       System.out.println("Enter the 20 integer numbers:");
       int num[] = new int[20];
       float sum = 0;
       for(int i = 0; i < 20; i++){
         num[i] = input.nextInt();
         if(num[i] == -1){
           break;
       }
         sum = sum + num[i];
       }
      average(sum);
    }
    } 
 

        
    
    
