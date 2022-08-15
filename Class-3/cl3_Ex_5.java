


/*
! WAP that takes a YEAR from the user & print wether that YEAR is a LEAP YEAR  or not
 */
import java.util.*;
public class cl3_Ex_5 {
  public static void main (String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Please enter the YEAR: ");
int y = sc.nextInt();
if (((y % 4 == 0) && (y % 100!= 0)) || (y%400 == 0)){
  System.out.println("Year "+ y+ " is a LEAP YEAR");

}
else{

  System.out.println("Year "+ y + " is NOT a LEAP YEAR");
}

  }
}