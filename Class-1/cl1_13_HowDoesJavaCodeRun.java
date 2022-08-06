/*
 ! 14. How Does Java Code Run?
 */
import java.util.*;
public class cl1_13_HowDoesJavaCodeRun {
  public static void main(String[] args){
    System.out.println("How does Java Code Run?");
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Give an INTEGER Number: ");
    int a= sc.nextInt();
    System.out.println("Your given NUMBER is: "+ a);

    System.out.print("Give max One WORD: ");
    String OneWord= sc.next();
    System.out.println("Your given WORD is: "+ OneWord);

    System.out.print("Give whatever you like: ");
    String all = sc.nextLine();
    System.out.println("Your given SENTENCE is: "+ all);

   

    
  }
  
}
