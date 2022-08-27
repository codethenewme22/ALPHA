/*
 ! 4.10 Keep entering ni=umbers TILL user enters a MULTIPLE of 10:

 */
import java.util.*;
public class cl4_10_QuestionBreakKeyword {
public static void main(String args[]) {

  Scanner sc = new Scanner(System.in);
int a;
  do {
    System.out.print("Enter your Number: ");
    int n = sc.nextInt();
    a=n;
    if (n %10==0) { // Whenever any NUMBER will be completely DIVIDED by 10, it will EXIT the loop by using BREAK statement
      break;
    }
    System.out.println(n + " You are still inside of the Loop..");

  }
  while(true);
  System.out.println(("You have entered ") + a + (" which can be MULTIPLIED by 10...!"));
}
}
