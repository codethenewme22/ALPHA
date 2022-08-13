/*
! 3.2 PRINT THE LARGEST OF 2 NUMBERS:
A= 1;
B= 3;
 */

 import java.util.*;
public class cl3_2_PrintTheLargestOf2Numbers {
public static void main (String args []){
 Scanner sc = new Scanner(System.in);
 System.out.print("Please enter NUMBER ONE:");
 int a=sc.nextInt();
 System.out.print("Please enter NUMBER TWO:");
 int b=sc.nextInt();

if (a>b){
  System.out.println("NUMBER ONE is GREATER");
}
else if (a<b){
  System.out.println("NUMBER TWO is GREATER");
}
else if (a==b){
  System.out.println("Both NUMBERS are SAME.");
}
else{

  System.out.println("NUMBER ONE is GREATER");
}

}
  
}
