 /* 
  ! 9. Product of a & b:

? What it means Product of a & b?
* a*b is called the PRODUCT of a & b


import java.util.*;
public class cl1_9_SumOfaAndb {
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);


    System.out.print(" Please enter first number: ");
int a = sc.nextInt();
System.out.print(" Please enter second number: ");
int b = sc.nextInt();
int product = a*b;
System.out.println(" Product of A & B is: "+product);

  }
}
  */

import java.util.*;
public class cl1_9_SumOfaAndb {
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("Please enter the value of A:");
    int a= sc.nextInt();
    System.out.print("Please enter the value of B:");
    int b= sc.nextInt();

    System.out.println("Product of A & B is: " +a*b);
  }
}