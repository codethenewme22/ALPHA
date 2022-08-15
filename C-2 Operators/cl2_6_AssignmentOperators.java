
/*
 ! 2.6 ASSIGNMENT OPERATORS:

 ?      OPERATORS        MEANING           
 todo       =             EQUAL TO  
  todo      +=            PLUS EQUAL TO    
 todo       -=            MINUS EQUAL TO    
 todo       *=            MULTIPLY EQUAL TO    
 todo       /=            DIVISION EQUAL TO    
 todo       %=            REMINDER EQUAL TO    
 USED FOR: 
 * a= 10;
 * b = 5;
 * a=b means the VALUE of a (10) will be assigned into the VALUE of b (5). Final output will be b= 10      
 * 
 *           
  
 USED FOR: 
 * a= a+10;
 * b = b-5;
 * a= a+10 can be written in a short way like: a+=10      
 * b = b-5 can be written in a short way like: b-=10      
 */
public class cl2_6_AssignmentOperators {
  public static void main (String args []){

    int a =10;
    System.out.println("Normal value of a: "+a);

    a+=10; // a = a + 10 which means a= (a)10+10=20
    System.out.println("Value after PLUS EQUAL TO : "+a);

    System.out.println("\n\n");

int b= 20;
    System.out.println("Normal value of b: "+b);

    b-=10; // a = a + 10 which means a= (a)20-10=10
    System.out.println("Value after MINUS EQUAL TO : "+b);

    System.out.println("\n\n");

    System.out.println("Normal value of b: "+b);
    b*=10; // b = b * 10 which means b= (b) 10*10=100
    System.out.println("Value after MULTIPLY EQUAL TO : "+b);

    System.out.println("\n\n");

    System.out.println("Normal value of b: "+b);
    b/=10; // b = b / 10 which means b= (b) 100/10=10
    System.out.println("Value after DIVISION EQUAL TO : "+b);

    System.out.println("\n\n");

    System.out.println("Normal value of b: "+b);
    b%=10; // b = b % 10 which means b= (b) 10 % 10=0
    System.out.println("Value after MODULAR EQUAL TO : "+b);
  }
  
}
