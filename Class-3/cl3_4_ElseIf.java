

/*
 ! 3.4 ELSE IF: is used to check mMORE THAN ONE conditions.
 todo Why ELSE IF is IMPORTANT: We can write IF condition one after another NUMEROUS TIMES. But the problem with IF is it will CHECK all the IF one after another which will make the program inefficient.

 ? But in ELSE IF condition it does not check all the conditions. When ONE condition is FALSE only then it goes to the NEXT condition.


 if (condition-1){

 }
 else if (condition-2){

 }
 else if (condition-3){

 }
else if (condition-4){

}
else{

}
 */
import java.util.*;
public class cl3_4_ElseIf {
public static void main (String args[]) {
Scanner sc = new Scanner(System.in);

System.out.print("Please enter the AGE you wish: ");
int a=sc.nextInt();

if (a>=0 && a<=1){
System.out.println("Infant");
}
else if (a>=2 && a<=4){
  System.out.println("Toddler");
}
else if (a>=5 && a<=12){
  System.out.println("Child");
}
else if (a>=13 && a<=19){
  System.out.println("Teen");
}
else if (a>=20 && a<=39){
  System.out.println("Adult");
}
else if (a>=40 && a<=59){
  System.out.println(" Mid Age Adult");
}
else if (a>=50 && a<=100){
  System.out.println("Old");
}
else{
  System.out.println("Are you not dead yet...!!");
}
}
}
