/*
 ! 10. Area of Circle
 * Formula of AREA OF CIRCLE: 3.14 * radius * radius
 */
import java.util.*;
public class cl1_10_AreaOfCircle {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);


System.out.print("Please enter the RADIUS:");
float rad =sc.nextFloat();
float area = 3.14f * rad * rad;  // 3.14f will make it as a FLOAT DATA TYPE. Otherwise without f it will be a DOUBLE DATA TYPE


System.out.println("The area of circle is:"+area);
// or
System.out.println("The area of circle is: "+(3.14*rad*rad));


}
}
