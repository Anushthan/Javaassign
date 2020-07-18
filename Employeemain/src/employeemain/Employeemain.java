/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemain;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Employeemain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name: ");
            String fn = sc.next();

        System.out.println("Enter the last name: ");
            String ln = sc.next();

        System.out.println("Enter the salary: ");
            double salary = sc.nextDouble();
            if(salary < 0){
                salary = 0.0;
            }
       Employee e = new Employee(fn, ln, salary);
       e.getEmployee();
       e.setEmployee();  
    }
}

    
    

