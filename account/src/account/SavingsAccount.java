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
public class SavingsAccount {
    
    private float annualInterestRate;
    private double savingBalance;
    
    
    public SavingsAccount(float ai,double sb){
        this.annualInterestRate=ai;
        this.savingBalance=sb;
    }
    
    public double calculateMonthlyInterest(){
        double monthlyinterest = (annualInterestRate*savingBalance)/12;
        savingBalance = savingBalance + monthlyinterest;
        return monthlyinterest;
         }
    
    public void modifyinterestRate(float new_rate){
        this.annualInterestRate= new_rate;
    }
    
    public void currentSavingBalance(){
        System.out.println("current balance is = "+ this.savingBalance);
    }
    
    
}
