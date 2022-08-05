/*
! 4. VARIABLES & LITERALS in JAVA: 
* Variable is something who's value can be changed.
a= 10, b=5 //Here a & b are the variables, the values are 10 & 5 which can be changed if needed.

* LITERAL: Values that are UNIVERSAL which never change:
a= 10, b=5 
2*(a+b) \\ Here the values of a & b can change but 2 will remain the same no  matter what.

* NUMBER LITERAL: 1 2 3 4 5 6 7 8 9 0
* CHARACTER LITERAL: A B C D E F @ * 

! IDENTIFIERS in JAVA: There are sone PRE-DEFINED set of RULES like some WORDS, CHARACTERS which play a specific role in JAVA are called IDENTIFIERS.
Example: main, void, print, println public static

! MEMORY: Whatever VARIABLES or INFORMATION we use in JAVA is STORED in the MEMORY
Example: int a=10; \\It means a specific block in the memory is created for a which holds 10 in it. When we change the value, previous value is deleted & replaced by the new value.
* Every memory location has a specific address which we can't see in naked eyes.
 
 */

// Find out the PARAMETER of a given rectangular (10,5):
public class cl1_4_VariablesAndDataTypes {
  public static void main(String[] args){
    float a = 10, b=5, rec= 2*(a+b);
    System.out.printf("PARAMETER of the rectangular is:\n",rec);

  }
  
}
