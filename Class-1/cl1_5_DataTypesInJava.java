/*
 ! 5. DATA TYPES in Java:
 ? There are 2 types of data in Java:
 todo 1. PRIMITIVE types: data types which ALREADY EXIST in Java
 byte, short, int, long, float, double, char, boolean
 todo 2. NON-PRIMITIVE types: data types which WE HAVE TO CREATE in Java
 String, Array, Class, Object, Interface

 * Java is a TYPED language. It means we have to DECLARE the TYPE of a VARIABLE before we create the variable.
 Example: 
 int a=10 // for INTEGER data type
 float b=10.f // for FLOAT data type
 char ch = 'A' // for CHARACTER data type
 
 ? PRIMITIVE DATA TYPE-> byte:
 public class cl1_5_DataTypesInJava {
  public static void main(String[] args){
    byte b=8;
    System.out.println(b);

    char ch='a';
    System.out.println(ch);

    boolean var=true;
    System.out.println(var);

    float rate= 59;
    System.out.println(rate);
    
    double price = 10.5;
    System.out.println(price);

    long amount = 1000000000;
    System.out.println(amount);

    short n= 250;
    System.out.println(n);

    int number= 20;
    System.out.println(number);

  }
  
}

! Size of DATA TYPES:
* Why do we have these 8 primitive data types? Why not less or why not more? 
* These data types are defined by the SPACE it takes in the MEMORY.
* Each DATA TYPE takes different amount of space in the memory.

* We define MEMORY by BYTES. 8 BITS = 1 BYTE. 1 BIT is the single information space in the memory. [1][2][3][4]5[6]7[8] BITS= 1 BYTE
byte=         1 byte/ 8 bits    [-128 t0 127]= 256 numbers can be stored
short=        2 bytes 16 bits
char=         2 bytes 16 bits
boolean=      1 bytes 8 bits
int=          4 bytes 32 bits
long=         8 bytes 64 bits
float=        4 bytes 32 bits
double=        8 bytes 64 bits


int, long, float, double, char, boolean


 */
public class cl1_5_DataTypesInJava {
  public static void main(String[] args){
    byte b=8;
    System.out.println(b);

    char ch='a';
    System.out.println(ch);

    boolean var=true;
    System.out.println(var);

    float rate= 59;
    System.out.println(rate);

    double price = 10.5;
    System.out.println(price);

    long amount = 1000000000;
    System.out.println(amount);

    short n= 250;
    System.out.println(n);

    int number= 20;
    System.out.println(number);
int BDT= 20;
System.out.println(BDT);
  }
  
}
