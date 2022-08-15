public class cl2_EX_1 {
  public static void main (String args[]){
    int x= 2;
    int y= 5;
    int exp1= (x*y/x); // 2*5/2= LEFT > RIGHT = 10/2= 5
    int exp2= (x*(y/x)); // 2*(5/2)= BRACKET first = 2* 2=4
  
    System.out.println(exp1);
    System.out.println(5/2);
    System.out.println(exp2 );
  }
}
