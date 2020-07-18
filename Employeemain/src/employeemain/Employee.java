/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemain;

/**
 *
 * @author Dell
 */
public class Employee extends Employeemain{
    public String fn;
    public String ln;
    public double salary;
    public double rise_sal;
    
    public Employee(String f, String l, double sal){
        this.fn = f;
        this.ln = l;
        this.salary = sal;
    }
    
    public void getEmployee(){
        this.rise_sal = this.salary + (this.salary * 0.1);     
    }    
    public void setEmployee(){
        System.out.println("The first name: " +this.fn);
        System.out.println("The last name is: " +this.ln);
        System.out.println("Salary is:" +this.salary);
        System.out.println("Raised Salary is:" +this.rise_sal);
	}
    }
