/*
! 3.1 CONDITIONAL STATEMENTS:
? IF ELSE
? ELSE IF
? TERNARY OPERATOR
? SWITCH

? IF ELSE:
 if (condition){
 todo if that condition is TRUE, then execute the statement written HERE.
 todo if that condition is NOT TRUE, then execute ELSE statement written DOWN.
 }
 else {
todo when the condition IF is NOT TRUE, then execute ELSE statement written HERE.

 }
 */
import java.util.*;
public class cl3_1_IfElse {
  public static void main(String[] args) {


Scanner sc = new Scanner(System.in);
System.out.print("Please enter your age: ");
int age = sc.nextInt();

    if (age>=18){
      System.out.println("You are allowed to enter in to the CLUB...!!!");
      
    }
    else{
      System.out.println("Sorry KIDDO, go back to your MOM.");

    }
  
  }
}
