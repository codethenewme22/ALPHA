
/*
 ! 2.2 ARITHMETIC Operators: 

 todo BINARY Operators: Where we need  TWO OPERANDS
 todo UNARY Operators: Where we need  ONE OPERAND

 ? BINARY           UNARY
 *  +                 ++  Increment Operator
 *  -                 --  Decrement Operator
 *  *                 
 *  /                 
 *  %                 



 * UNARY Operators give a SIMPLE WAY of writing a BINARY operator (only + and - are supported)
 ? BINARY   a = (a+1) 
 ? UNARY    a++   or ++a
 ? UNARY    a--   or --a


 ? PRE INCREMENT Operator: ++a or --a: It will CHANGE the value FIRST & then the CHANGED value will be USED:


 ? POST INCREMENT Operator: a++ or a--:  It will use the EXISTING value FIRST & then will CHANGE the value:
 */
 public class cl2_3_UnaryOperators {
  public static void main (String args []){
    int a= 10;
    int b= ++a;
    System.out.println("Normal output of A= "+a); // Here because of PRE INCREMENT the value of a has already been changed (1+10= 11) as it is showing in the output
    System.out.println(" After using PRE INCREMENT = "+b); // Here b is just showing the changed output of a (1+10= 11) in the output


    int c= 10;
    int d= c++;
    System.out.println("Normal output of A= "+c); // Here because of POST INCREMENT the value of c is the original one as it is showing in the output but the POST INCREMENT has already happened  (1+10= 11) inside of the MEMORY which is not visible yet.
    System.out.println(" After using POST INCREMENT = "+d); // Here b is showing the ORIGINAL VALUE of a (10) in the output
    
    
      }
}


