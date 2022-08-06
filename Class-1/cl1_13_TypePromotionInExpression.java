/*
 ! 12. TYPE PROMOTION in EXPRESSION:

 * EXPRESSIONS: 
 * a+b*c/d
 * a (int)+b(float)*c(char)/d(long)
  
 ? 1. Java AUTOMATICALLY PROMOTES each byte, short or char OPERAND to int when EVALUATING an expression.

 * Method-1:
 ! PASS
 public class cl1_13_TypePromotionInExpression {
  public static void main(String args[]) {
    char a='a'; // ASCII of a is 97
    char b='b'; // ASCII of b is 98
    System.out.println("ASCII value of a is: "+(int)(a));
    System.out.println("ASCII value of b is: "+(int)(b));
    System.out.println("ASCII value of b-a is: "+(b-a)); // Here java has automatically char into int (b-a) -> (98-97) = 1
  }
}
 * Method-2:
 ! FAIL
 * public class cl1_13_TypePromotionInExpression {
  public static void main(String args[]) {
    char a='a'; 
    char b='b';
    char c= a-b; // Here it't not gonna work as c here is CHAR & it's not possible to CHAR to INT
    System.out.println(c);
  }
}

 * Method-3:
 ! FAIL
 public class cl1_13_TypePromotionInExpression {
  public static void main(String args[]) {
    short a= 5;
    byte b= 25;
    char c= 'c';
    byte bt = (a+b+c);  // It has CONVERTED (a+b+c) into INT. It's not gonna work as INT(4) to BYTE(1) conversion is not possible.
    System.out.println(bt);

  }
}

 * Method-4:
 ! PASS but INVALID
 public class cl1_13_TypePromotionInExpression {
  public static void main(String args[]) {
    short a= 5;
    byte b= 25;
    char c= 'c';
    byte bt = (byte)(a+b+c);  // Here TYPECAST (byte) forcing the INT (a+b+c) to convert into BYTE. It will work but will lose DATA while will give FALSE OUTPUT
    System.out.println(bt);

  }
}

 ? 2. if one OPERAND is long, float or double, the WHOLE EXPRESSION is PROMOTED to long, float or double respectively.

 * Method-1:
 ! PASS:
 public class cl1_13_TypePromotionInExpression {
  public static void main(String args[]) {
    int a= 10; 
    float b= 20.25f;
    long c= 25;
    double d =30;
    double ans = (a+b+c+d);// Here all the INT, FLOAT & LONG has been converted to DOUBLE. 
    System.out.println(ans); 

  }
}

 * Method-2:
 ! FAIL:
public class cl1_13_TypePromotionInExpression {
{
  public static void main(String args[]) {
    int a= 10; 
    float b= 20.25f;
    long c= 25;
    double d =30;
    int ans = (a+b+c+d);// possible lossy conversion from double to int
    System.out.println(ans); 
    }
}
 * Method-3:
 ! FAIL:
 public class cl1_13_TypePromotionInExpression {
  public static void main(String args[]) {
    byte b= 5;
    byte a = b*2; // Here (b*2) has become an EXPRESSION & java converted it into INT 10. INT(4) is BIBBER than BYTE(1). So it won't work.
    System.out.println(a); 

  }
 * Method-4:
 ! PASS:
 public class cl1_13_TypePromotionInExpression {
  public static void main(String args[]) {
    byte b= 5;
    byte a = (byte) (b*2); // Here (b*2) has become an EXPRESSION & java converted it into INT 10. INT(4) is BIBBER than BYTE(1). So it won't work unless we TYPE-CAST  this INT (b*2) into BYTE (byte)
    System.out.println(a); 

  }
}
 * Method-2:
 */
public class cl1_13_TypePromotionInExpression {
  public static void main(String args[]) {
    byte b= 5;
    byte a = (byte) (b*2); // Here (b*2) has become an EXPRESSION & java converted it into INT 10. INT(4) is BIBBER than BYTE(1). So it won't work unless we TYPE-CAST  this INT (b*2) into BYTE (byte)
    System.out.println(a); 

  }
}
