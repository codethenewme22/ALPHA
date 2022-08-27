/*
 ! 4.9 BREAK STATEMENT: is used to EXIT form a LOOP whenever we want to
* Example: Suppose we have to print 1 to 10 but we wanna get out of the loop when 7 is printed:

 */

public class cl4_9_BreakStatement {
  public static void main(String args[]){

    for (int i =1; i <=10; i++){
      if (i==8){
        break;
      }

    System.out.println(i);
    }

    System.out.println("By using the BREAK statement, I am OUT of the LOOP...! \nI didn't print 8,9 & 10.");
  }
  
}
