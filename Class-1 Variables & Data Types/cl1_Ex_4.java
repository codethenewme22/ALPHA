/*
 ! 4. What will be the DATA TYPE of the RESULT in the following Java Code:
 */

public class cl1_Ex_4 {
  public static void main(String[] args){
    byte b = 4;
    char c= 'a';
    short s = 512;
    int i = 1000;
    float f = 3.14f;
    double d = 99.9954;
    System.out.println("result= "+ ((f*b) + (i%c) - (d*s))); // DOUBLE will be the right DATA TYPE CONVERSION as it is the BIGGEST one.
    
  }
  
}
