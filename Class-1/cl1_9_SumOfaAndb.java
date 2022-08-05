 /* 
  ! 8. SUM of a & B using SCANNER object:


 */
import java.util.*;
public class cl1_9_SumOfaAndb {
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);


    System.out.print(" Please enter first number: ");
int a = sc.nextInt();
System.out.print(" Please enter second number: ");
int b = sc.nextInt();
int sum = a+b;
System.out.println(" Total of the Numbers is: "+sum);
System.out.println("Everything looks nice here.");
  }
}
