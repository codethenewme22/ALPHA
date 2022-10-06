/*
 ! Check f a Number is PRIME or Not:
 */
import java.util.*;

public class cl4_13_CheckIfANumberIsPrimeOrNot {
  public static void main(String[] args){
    System.out.print("Please enter a Number to check: ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

if (n==2){
  System.out.println(n+ " is a PRIME Number");
} else{
  boolean isPrime= true;
  for(int i=2; i<=Math.sqrt(n); i++){
    if(n%i==0){
      isPrime=false;
    }
  }

  if(isPrime==true){
System.out.println(n+" is a PRIME Number.");
}
else{
  System.out.println(n+" is a PRIME Number.");

}

}





  }
  
}
