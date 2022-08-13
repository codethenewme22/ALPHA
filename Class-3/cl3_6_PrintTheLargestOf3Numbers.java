/*
 ! 3.6 Print The Largest Of 3 Numbers:
 import java.util.*;
public class cl3_6_PrintTheLargestOf3Numbers {
  public static void main (String args[]){
  Scanner sc = new Scanner(System.in);
  
  System.out.print("Please enter FIRST NUMBER:");
  int a= sc.nextInt();
  System.out.print("Please enter SECOND NUMBER:");
  int b= sc.nextInt();
  System.out.print("Please enter THIRD NUMBER:");
  int c= sc.nextInt();

  if (a>b){
    System.out.println(a+"is GREATER than"+b);
  }
  else{
        System.out.println(b+"is GREATER than"+a);
  }
  if (a>c){
    System.out.println(a+"is GREATER than"+c);
  }
  else{
        System.out.println(c+"is GREATER than"+a);
  }
  if (b>c){
    System.out.println(b+"is GREATER than"+c);
  }
  else{
        System.out.println(c+"is GREATER than"+b);
  }
  
  }
  
}
 */
import java.util.*;
public class cl3_6_PrintTheLargestOf3Numbers {
  public static void main (String args[]){
  Scanner sc = new Scanner(System.in);
  
  System.out.print("Please enter FIRST NUMBER:");
  int a= sc.nextInt();
  System.out.print("Please enter SECOND NUMBER:");
  int b= sc.nextInt();
  System.out.print("Please enter THIRD NUMBER:");
  int c= sc.nextInt();

  if ((a>b) && (a>c)){
    System.out.println(a+" is GREATER than "+b +" and " +c);
  }
  else if (b>c){
        System.out.println(b+" is GREATER than "+a +" and " +c);
  }
  else{
    System.out.println(c+" is GREATER than "+b +" and " +a);
  }
  
  
  
  }
  
}
