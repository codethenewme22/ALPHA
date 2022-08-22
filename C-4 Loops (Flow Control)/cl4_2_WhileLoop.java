/*
 ! 4.2 WHILE LOOP:
 while (condition){

  do something
 }
 */

 import java.util.*;
public class cl4_2_WhileLoop {
  public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Whatever you will write, it will be echoed 100 times.");
System.out.print("Please enter TEXT as you wish: ");
String text= sc. nextLine();
int counter=0;
while(counter<99){
    System.out.println(text);
    counter++;
    
  }
  System.out.println(text+" was printed " + counter+  " times.");

  }

  
}
