/*
 ! 4.5 Print sum of first n natural numbers:
 ? What is the SUM of NATURAL NUMBER: 
 * Example: 5 is the given NUMBER. The  SUM of NATURAL NUMBER 5 will be: 1+2+3+4+5 =15
 */
import java.util.*;
public class cl4_5_PrintSumOfNNaturalNumbers {
  public static void main(String [] args){
  System.out.print("Please enter any NAtural NUMBER: ");
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
int sum =0, i=1;

while(i <=n){
  sum += i;
  i++;
}

  System.out.println("The sum of the NAtural NUMBER "+n+ " is: "+ sum);


  }
  
}
