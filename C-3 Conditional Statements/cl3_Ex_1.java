/*
 ! WAP to get a number from the user & print wether it is positive or negative.
 */
import java.util.*;
public class cl3_Ex_1 {
  public static void main (String args[]) {
Scanner sc = new Scanner(System.in);

System.out.println("Please enter the desired number: ");
int n = sc.nextInt();
// int a=0;

if (n>=0){
  System.out.println(n+ " is a POSITIVE number");
  
}
else{
  System.out.println(n+ " is a NEGATIVE number");

}

  }
}
