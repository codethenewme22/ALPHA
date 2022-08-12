/*
 ! 2.4 RELATIONAL Operators: 

 todo 


 ? RELATIONAL     MEANING                                PURPOSE
 *  ==            EQUAL TO EQUAL TO                      TO CHECK IF BOTH OF THE OPERANDS ARE EQUAL OR NOT
 *  !=            NOT EQUAL TO                           TO REVERSE THE NORMAL OUTPUT of EQUAL TO EQUAL TO EQUAL
 *  >             GREATER THAN                           TO CHECK IF ONE OPERAND IS GREATER THAN ANOTHER OPERAND
 *  <             LESS THAN                              TO CHECK IF ONE OPERAND IS LESS THAN ANOTHER OPERAND
 *  >=            GREATER THAN or EQUAL TO               TO CHECK IF ONE OPERAND IS EITHER GREATER OR EQUAL THAN ANOTHER OPERAND
 *  <=            LESS THAN or EQUAL TO                  TO CHECK IF ONE OPERAND IS EITHER LESS OR EQUAL THAN ANOTHER OPERAND



 */
public class cl2_4_RelationalOperators {
  public static void main (String args []){
    int a= 10;
    int b= 5;

    // ?  == EQUAL TO EQUAL TO   is used  TO CHECK IF BOTH OF THE OPERANDS ARE EQUAL OR NOT
    System.out.println("TRUE OR FALSE?  \n"+ (a==b));

    // ? != NOT EQUAL TO    is used    TO REVERSE THE NORMAL OUTPUT of EQUAL TO EQUAL TO EQUAL
    System.out.println("TRUE OR FALSE?  \n"+ !(a==b));
    
    //? > GREATER THAN     is used     TO CHECK IF ONE OPERAND IS GREATER THAN ANOTHER OPERAND
    System.out.println("Is 10 GREATER than 5 ?  \n"+ (a>b));


    //? < LESS THAN     is used     TO CHECK IF ONE OPERAND IS LESS THAN ANOTHER OPERAND
    System.out.println("Is 10 LESS than 5 ?  \n"+ (a<b));


    int c= 15;
    int d= 10;

    //? >= GREATER THAN or EQUAL TO     is used     TO CHECK IF ONE OPERAND IS EITHER GREATER OR EQUAL THAN ANOTHER OPERAND
    System.out.println(" Is 15 GREATER THAN or EQUAL TO 10 ?  \n"+ (c>=d));


    //? <= LESS THAN or EQUAL TO     is used     TO CHECK IF ONE OPERAND IS EITHER LESS OR EQUAL THAN ANOTHER OPERAND
    System.out.println("Is 15 LESS THAN or EQUAL TO 10 ?  \n"+ (c<=d));
    
  
}
}
