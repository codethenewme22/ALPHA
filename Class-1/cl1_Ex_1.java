/*
 ! Question-1: In a program,input3numbers:A,BandC.You have to output the average of these 3 numbers
 */
import java.util.*; 
public class cl1_Ex_1{

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter 3 numbers with: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    float avg = (a+b+c)/3;
    System.out.println("The average of these 3 numbers is: "+avg);
    
  }
}
