/*
 ! 4.6 Print REVERSE of a NUMBER:
 *Example: 
    int n= 10899
 * OUTPUT: 99801
 
todo If we want to GET the LAST DIGIT of a NUMBER: number%10 = LAST DIGIT will be there.
todo If we want to REMOVE the LAST DIGIT of a NUMBER: number/10 =  LAST DIGIT will be REMOVED 
 */
public class cl4_6_PrintReverseOfANumber {
  public static void main (String args []){

    
    int n= 10899;
    while(n>0){
      int lastDigit= n%10;
      System.out.print(lastDigit);
      n= n/10;
      
    }
    System.out.println();
  }
  
}
