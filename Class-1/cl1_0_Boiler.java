/*


 


  public static void main(String args[]){
    System.out.println(" ");
  }



import java.util.*; 
// import java.io.*;
public class cl1_0_Boiler {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in); 
    
    System.out.print(" Please enter first number: ");
float a = sc.nextFloat();
System.out.print(" Please enter second number: ");
float b = sc.nextFloat();
float sum = a+b;
System.out.println(" Total of the Numbers is: "+sum);
    
    

  }
}
*/

import java.util.*; 
public class cl1_0_Boiler{
  public static void main(String[] args){
  System.out.println("How does Java Code Run?");
  Scanner sc = new Scanner(System.in);

  System.out.print("Give an INTEGER Number: ");
  int a= sc.nextInt();
  System.out.println("Your given NUMBER is: "+ a);

  System.out.print("Give max One WORD: ");
  String OneWord= sc.next();
  System.out.println("Your given WORD is: "+ OneWord);
  System.out.print("Give whatever you like: ");
    String all = sc.nextLine();
    System.out.println("Your given SENTENCE is: "+ all);
    }
}