/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author Dell
 */
public class Account {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SavingsAccount saver1 = new SavingsAccount(4,2000);
        SavingsAccount saver2 = new SavingsAccount(4,3000);
        System.out.println("--------------------------------------");
        System.out.println("For saver 1");
        System.out.println(saver1.calculateMonthlyInterest());
        saver1.currentSavingBalance();
        System.out.println("---------------------------------------");
        System.out.println("For saver 2");
        System.out.println(saver2.calculateMonthlyInterest());
        saver2.currentSavingBalance();
        System.out.println("Set the annual interest rate to 5%");
        saver1.modifyinterestRate(5);
        saver2.modifyinterestRate(5);
        
        
        
        
        
    }
    
}
