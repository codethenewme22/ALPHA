/*
! Enter cost of 3 items from the user (using FLOAT data type)- a PENCIL, a PEN & an ERASER. You have to output TOTAL COST of the ITEMS back to the user as their BILL. (Add on: You can also try ADDING 18% GST TAX as an advanced problem )
 */
import java.util.*;
public class cl1_Ex_3 {
  public static void main(String[]args){
System.out.print("Enter the price of PENCIL: ");
Scanner sc = new Scanner(System.in);

float pencil= sc.nextFloat();
System.out.print("Enter the price of PEN: ");

float pen= sc.nextFloat();
System.out.print("Enter the price of ERASER: ");

float eraser= sc.nextFloat();
float total = (pencil+pen+eraser);
System.out.println("Total price of 3 items: "+total);

float gst= (total+(0.18f*total));
System.out.println("Final PRICE with GST: "+gst);
  
  }
  
}
// 1,000+ (1,000X(18/100)) =
//  (Original Cost * (100 / (100 + GST% ) ) )