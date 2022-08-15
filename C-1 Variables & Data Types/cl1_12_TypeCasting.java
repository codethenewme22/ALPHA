/*
 ! TYPE CASTING/NARROWING/EXPLICIT CONVERSION:
 ? Is something what java DOESN'T ALLOW us to do but we FORCE to DO it. If we wanna SHRINK A VARIABLE which might lead to DATA LOSS but yet we wanna do it. 
 * float a =25.1234;  // Here a is  FLOATING DATA TYPE
 * int b= a; // Here b is INTEGER DATA TYPE & we wanna convert that a (FLOAT) to b (INT)

 */
import java.util.*;
public class cl1_12_TypeCasting {
  public static void main(String[] args){
    float a= 25.12f;
    int b= (int) a;
    System.out.println(b);


    float marks = 89.9999f;
    int d =(int)marks;
    System.out.println(d);


    char ch ='a';
    int number = ch;
    System.out.println(number);  // It will give the ASCII number of a which is 97


  }
  
}
