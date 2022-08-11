/*
 ! 2. WAP to input the SIDE of a  SQUARE & output the AREA of the SQUARE:
 */

 import java.util.*;
public class cl1_Ex_2 {
  public static void main(String[] args) {

    System.out.println("Please enter the the value of 2 SIDES of a SQUARE: ");
    Scanner sc = new Scanner(System.in);
    int s= sc.nextInt();

    int area= (s*s);
    System.out.println("The area of the SQUARE is :"+ area);
  }
  
}
