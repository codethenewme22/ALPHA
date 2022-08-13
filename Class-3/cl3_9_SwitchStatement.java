/*
 ! 3.9 SWITCH STATEMENT:

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
public class cl3_9_SwitchStatement {
public static void main (String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Please enter a Number: ");
int n = sc.nextInt();

  switch(n){
    case 1: System.out.println("You will get a BANANA");
    break;
    case 2: System.out.println("You will get an APPLE");
    break;
    case 3: System.out.println("You will get an ORANGE");
    break;
    case 4: System.out.println("You will get a COCONUT");
    break;
    case 5: System.out.println("You will get a LYCHEE");
    break;
    default: 
    System.out.println("You deserve NOTHING....!!");

  }

}
  
}

