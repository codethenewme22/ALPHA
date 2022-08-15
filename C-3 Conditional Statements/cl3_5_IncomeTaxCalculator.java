/*
 ! 3.5 INCOME TAX CALCULATOR
 */
import java.util.*;
public class cl3_5_IncomeTaxCalculator{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter your YEARLY INCOME: ");
    int in = sc.nextInt();
    int tax=0;
    
if(in>= 0 && in<=500000){
 
System.out.println("You are too POOR to pay INCOME TAX.");

}
else if(in>= 500001 && in<=1000000){
  tax= (int)(in * 0.2f);
  System.out.println("You have to pay 20% INCOME TAX.");
  
  }
  else if(in>= 1000001){
    System.out.println("You have to pay 30% INCOME TAX.");
    tax= (int)(in * 0.3f);
    }
    else{

      System.out.println("You have to pay with your life..!!!");
    }
    System.out.println("Your tax is:" +tax);
    
  }
}