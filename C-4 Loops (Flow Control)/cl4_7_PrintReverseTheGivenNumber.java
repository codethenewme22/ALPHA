/*
! 4.7 Print REVERSE of the GIVEN NUMBER:
 */

public class cl4_7_PrintReverseTheGivenNumber {
public static void main(String args[]){
int n= 10899;
// int lastDigit;
int reverse= 0;

while(n>0){
  int LastDigit= n % 10;
  n= n / 10;
  reverse = (reverse * 10) + LastDigit;
}

System.out.println(reverse);

}

}
