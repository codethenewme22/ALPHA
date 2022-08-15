/*
 ! How to take INPUT from the USER:
 ? A class has to be created to TAKE INPUT from the user: 
 * Scanner
 ? This header should be put in the beginning:
 * import java.util.*;

 */
import java.util.*; // This will import the UTILITY files which will allow us to give INPUT from the USER
public class cl1_8_InputInJava {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);  // Scanner> then a variable name>  and then new Scanner(System.in); 

/* 
    // todo INPUT without SPACE:
        System.out.print("Please enter a anything without spaces: ");

    String Name= sc.next();  // This > next() < CAPTURES the INPUT from the USER & > String < STORES the INPUT as STRING.
    // ! > next() < only can't recognize SPACE!! So, it can take any number of characters unless a SPACE 
    System.out.println(Name);

    */
    
    // todo INPUT with SPACE:
    System.out.print("Please enter a anything with spaces: ");
    String FullName= sc.nextLine(); 
    System.out.println(FullName);


    // todo INPUT NUMBER:
    System.out.print("Please enter a Number: ");
    int number= sc.nextInt();
    System.out.println(number);


    // todo Different TYPEs of INPUT (integer, characters, line ) requires different types of FUNCTIONS.
    /*
     * next()           is for Characters WITHOUT space
     * nextLine()       is for Characters WITH space
     * nextInt()        is for INTEGER
     * nextFloat()      is for FLOAT
     * nextDouble()     is for DOUBLE
     * nextFBoolean()   is for BOOLEAN
     * nextShort()      is for SHORT
     * nextLong()       is for LONG
     *
     * Scanner sc = new Scanner(System.in); 
     *  float price= sc.nextFloat();
     */
  }
}
