
/*
! 4.4 Print number form 1 to N:
 */
import java.util.*;
public class cl4_4_PrintNumberFrom1toN {
  public static void main(String[] args) {
    System.out.print("Please enter any NUMBER you want to print from 1 to N: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int counter=1;
    while(counter<=n){
      System.out.print(counter + " ");
      counter++;
      
    }
    System.out.println();

    
  }
  
}
