/*
 ! 4.11 CONTINUE STATEMENT: How to SKIp an ITERATION.
 * Example: We have to print 1 to 10 but it will skip number 6.
 */

public class cl4_11_ContinueStatement {
public static void main(String[] args){
 for(int i=1; i<=10; i++)
 {
   if(i==7){
    continue; // It means ITERATION will be skipped when i will be 7 and CONTINUE to the next ITERATION. 
}
    System.out.println(i);
}
System.out.println("7 was skipped due to the CONTINUE statement");


}
  
}
