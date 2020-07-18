/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datemainclass;

/**
 *
 * @author Dell
 */
public class Date {
    private int month;
private int day;
private int year;
  
public Date(int m, int d, int y){
month=m;
day=d;
year=y;
}
  
public void setMonth(int Months){
if(Months>=0 && Months<=12)
  
month=Months;
  
else{
month=0; }
}
  
public int getMonth(){
return month;
}
  
public void setDay(int Days){
if(Days>=0 && Days<=30)
  
day=Days;
else{
day=0;
}
}
public int getDay(){
return day;
}
public void setYear(int Years){   
year=Years;
}
  
public int getYear(){
return year;
}
public void displayDate(){
System.out.printf("%d/%d/%d\n",getMonth(),getDay(),getYear()) ;
}
}


