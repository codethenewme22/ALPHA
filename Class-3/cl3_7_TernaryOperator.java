/*
 ! cl3_7_Ternary Operator: means if there are 3 OPERANDS in one expression.


 todo     VARIABLE =        CONDITION ? STATEMENT-1 : STATEMENT-2
 ? int larger number     =  (5>3)     ?     5       :     3
 * if the condition (5>3) is TRUE, then STATEMENT-1 will be the output.
 * if the condition (5>3) is FALSE, then STATEMENT-2 will be the output.
 */
import java.util.*;
public class cl3_7_TernaryOperator {
public static void main (String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Please enter the  NUMBER: ");
int a = sc.nextInt();
String type =(a%2==0) ? "EVEN": "ODD";

System.out.println(a+ " is an " +type+ " number");


}
}
