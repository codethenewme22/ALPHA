/*
 ! 4. 12 Display All Numbers Entered By User Except Multiples Of 10
 */
import java.util.*;
public class cl4_12_DisplayAllNumbersEnteredByUserExceptMultiplesOf10{
  
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    do{
  System.out.println("Enter any Number: ");
int n = sc.nextInt();
if(n%10==0){
  System.out.println("Tada...!!!!!");
  // continue;
}
System.out.println("The Number was: " +n);
}
while(true);

  }
}
