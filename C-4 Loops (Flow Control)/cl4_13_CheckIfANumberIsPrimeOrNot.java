/*
 ! Check f a Number is PRIME or Not:
 */
import java.util.*;

public class cl4_13_CheckIfANumberIsPrimeOrNot {
  public static void main(String[] args){
    System.out.print("Please enter a Number to check: ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

boolean isPrime= true;
for(int i=2; i<=Math.sqrt(n); i++) {
  if(n% i==0){
isPrime=false;

  }

else{
  if(isPrime==true){
    System.out.println("Hurrah, "+n+" is a PRIME NUMBER...!");
  }
  else{
  
    System.out.println("Sorry, "+n+" is NOT a PRIME NUMBER....!");
  }

}

}


  }
  
}
