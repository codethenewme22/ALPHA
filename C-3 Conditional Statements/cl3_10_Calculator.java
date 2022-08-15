/*
 ! 3.10 CALCULATOR with SWITCH STATEMENT: + - * / %

 switch(variable){

  case 1: 
  break;

  case 2: 
  break;
    case 3: 
  break;
    case 4: 
  break;
  default:
 }
 */
import java.util.*;
public class cl3_10_Calculator {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);


System.out.print("Please enter FIRST NUMBER: ");
int a = sc.nextInt();

System.out.print("Please enter SECOND NUMBER: ");
int b = sc.nextInt();

System.out.print("Please enter the OPERATION you wanna perform: ");
char operator = sc.next().charAt(0);

switch (operator) {
  case '+': System.out.println("The ADDITION of " +a+ " + " +b+ " is= "+(a+b));
  break;
  case '-': System.out.println("The SUBTRACTION of " +a+ " - " +b+ " is= "+(a-b));
  break;
  case '*': System.out.println("The MULTIPLICATION of " +a+ " * " +b+ " is= "+(a*b));
  break;
  case '/': System.out.println("The DIVISION of " +a+ " / " +b+ " is= "+(a/b));
  break;
  case '%': System.out.println("The REMINDER of " +a+ " % " +b+ " is= "+(a%b));
  break;
default:
System.out.println("Is everything ok with your COMMON SENSE?");


}
}
}
