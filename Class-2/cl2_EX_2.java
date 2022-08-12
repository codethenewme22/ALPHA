public class cl2_EX_2 {
  public static void main (String args []){
  
  int x = 200, y = 50, z = 100;
if (x>y && y>z){ // 200>50 (T) && 50>100 (F) = TRUE 
  System.out.println("Hello"); 
}

if (z>y && z<x);{ // 100>50 (T) && 100<200 (T) = TRUE 
System.out.println("Java");
}
if(y+200<x && (y+150)<z); 
// (50+200)<200 && (50+150)<100
//250<200 && 200<100
// FALSE && FALSE = FALSE
{
  System.out.println("Hello Java");
}
  }
}
