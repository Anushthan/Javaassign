/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datemainclass;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class DateMainclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date date=new Date(0,0,0);
Scanner input=new Scanner(System.in);
System.out.println("Enter Month");
int m=input.nextInt();
date.setMonth(m);
  
System.out.println("Enter Day ");
int d=input.nextInt();
date.setDay(d);
System.out.println("Enter Year");
int y=input.nextInt();
date.setYear(y);
date.displayDate();
}
}

    
   
