
/*
 ! WAP to print "You have FEVER" if your BODY TEMPERATURE is above 103.3 and print "You are healthy"
 */
import java.util.*;
public class cl3_Ex_2 {
  public static void main (String args[]) {
Scanner sc = new Scanner(System.in);

System.out.print("Please enter the measured body temperature: ");
double n = sc.nextInt();


if (n>=103.5){
  System.out.println("You have FEVER");
  
}
else{
  System.out.println("You are HEALTHY");

}

  }
}