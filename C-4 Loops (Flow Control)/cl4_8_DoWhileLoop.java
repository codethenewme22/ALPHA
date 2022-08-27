
/*
 ! 4.8 DO WHILE Loop: 
 * SYNTAX: 
 do {
 Statements
 }
 while( condition);

 */
import java.util.*;
public class cl4_8_DoWhileLoop {
public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
System.out.println("Please write what you wanna print: ");
String text = sc.nextLine();
int count=1;
  do {

    System.out.println(text);
    count++;
    
  }
  while( count<=10);
}
}
