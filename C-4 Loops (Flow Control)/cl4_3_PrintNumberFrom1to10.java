

/*
 ! 4.3 Print number from 1 to 10:
 while (condition){

  do something
 }
 */

import java.util.*;
public class cl4_3_PrintNumberFrom1to10 {
  public static void main(String args[]) {
Scanner sc = new Scanner(System.in);

System.out.print("Please enter NUMBER as you wish: ");
int n= sc. nextInt();

while(n<=100){
    // System.out.println(n);
    n++;
    System.out.print(n+ " ");
    
  }
  System.out.println("The job is done...!!");

  }

  
}
