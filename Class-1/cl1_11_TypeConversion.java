/*
 ! 10. TYPE/WIDENING/IMPLICIT CONVERSION:
 ? What is TYPE CONVERSION: When we CONVERT one TYPE of DATA (int) into another TYPE of DATA  (float)

 * CONVERSION happens when:
  ? a. TYPE is COMPATIBLE: 
 * int to float is COMPATIBLE. But it to boolean is NOT COMPATIBLE
 ? b. DESTINATION TYPE > SOURCE TYPE: 
 * ORIGINAL / SOURCE DATA TYPE should be SMALLER than the DESTINATION DATA TYPE
 
? SMALLER >>>>>>>>>>>>>>>>BIGGER:
* byte(1) ->  short(2) _> int(4)  ->  float(4)  -> long(8)  -> double(8)
 
* Method-1:
todo This conversion is possible as long is bigger than int:
int a= 25;
long b= a;
System.out.println(b);


* Method-2:
todo This conversion is not possible as int is not bigger than long:
long c= 25;
int d= c;
System.out.println(d);


* Method-3:
todo This conversion is not possible as int is SMALLER than long
import java.util.*;
public class cl1_11_TypeConversion {
  public static void main(String args []){ 
Scanner sc = new Scanner(System.in);
int number= sc.nextFloat();

System.out.println(number);

  }
  
}

* Method-4:
todo This conversion is not possible as FLOAT is not bigger than INT:
import java.util.*;
public class cl1_11_TypeConversion {
  public static void main(String args []){ 
Scanner sc = new Scanner(System.in);
System.out.print("Please enter a Floating Number:");
float number= sc.nextInt();
System.out.println("The FLOAT has turned into INT: "+ number);

  }
  
}
 */
import java.util.*;
public class cl1_11_TypeConversion {
  public static void main(String args []){ 
Scanner sc = new Scanner(System.in);
System.out.print("Please enter a Floating Number:");
float number= sc.nextInt();
System.out.println("The FLOAT has turned into INT: "+ number);

  }
  
}
