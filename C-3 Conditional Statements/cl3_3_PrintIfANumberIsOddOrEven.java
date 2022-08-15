/*
 ! 3.3 PRINT IF A NUMBER IS ODD OR EVEN:
 */
import java.util.*;
public class cl3_3_PrintIfANumberIsOddOrEven {
public static void main (String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Please enter a NUMBER you wish: ");
int a=sc.nextInt();
if (a%2==0){
System.out.println(a+" is an EVEN NUMBER.");
}
else{
  System.out.println(a+" is an ODD NUMBER.");
}
}
}
