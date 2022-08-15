/*
 ! WAP to input WEEK NUMBER (1-7) &  print DAY of WEEK name using SWITCH CASE:
 */

 import java.util.*;
public class cl3_Ex_3 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the NUMBER of the DAY: ");
    int week = sc.nextInt();


    switch (week) {
case 1: System.out.println("MONDAY");
break;
case 2: System.out.println("TUESDAY");
break;
case 3: System.out.println("WEDNESDAY");
break;
case 4: System.out.println("THURSDAY");
break;
case 5: System.out.println("FRIDAY");
break;
case 6: System.out.println("SATURDAY");
break;
case 7: System.out.println("SUNDAY");
break;
default:
System.out.println("Are you from the MARS...!");

    }

  }
  
}
