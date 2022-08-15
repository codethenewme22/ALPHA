
/*
! cl3_8_Check If A Student Will Pass Or Fail:


 todo     VARIABLE =        CONDITION ? STATEMENT-1 : STATEMENT-2
 ? int larger number     =  (5>3)     ?     5       :     3
 * if the condition (5>3) is TRUE, then STATEMENT-1 will be the output.
 * if the condition (5>3) is FALSE, then STATEMENT-2 will be the output.
 */
import java.util.*;
public class cl3_8_CheckIfAStudentWillPassOrFail {
public static void main (String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Please enter the  MARK: ");
int a = sc.nextInt();
String result =(a>=33) ? "PASSED": "FAILED";

System.out.println("The Student got "+a+ ". The student has " +result+ " ....!!!");


}
}
