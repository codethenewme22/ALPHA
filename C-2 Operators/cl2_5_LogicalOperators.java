/*
 ! 2.5 LOGICAL Operators: 

 todo 


 ? OPERATOR          MEANING                                
 *    &&           LOGICAL AND  
 ? PURPOSE:                   
 * TO CHECK IF BOTH OF THE STATEMENTS ARE TRUE THEN OUTPUT WILL BE TRUE. OTHERWISE IN    ANY OTHER CASE, WILL BE FALSE
 
 ? STATEMENT-1  &&  STATEMENT-2       FINAL OUTPUT
 !    TRUE      &&    TRUE               TRUE
 *    TRUE      &&    FALSE              FALSE
 *    FALSE     &&    TRUE               FALSE
 *    FALSE     &&    FALSE              FALSE


  ? OPERATOR        MEANING                                
 *    ||           LOGICAL OR  
 ? PURPOSE:                   
 * TO CHECK IF ANY OF THE STATEMENTS ARE TRUE THEN OUTPUT WILL BE TRUE. IF BOTH OF THE STATEMENTS ARE FALSE, ONLY THEN THE FINAL OUTPUT WILL BE FALSE
 
 ? STATEMENT-1  ||  STATEMENT-2       FINAL OUTPUT
 *    TRUE      ||    TRUE               TRUE
 *    TRUE      ||    FALSE              TRUE
 *    FALSE     ||    TRUE               TRUE
 !    FALSE     ||    FALSE              FALSE


   ? OPERATOR        MEANING                                
 *      !           LOGICAL NOT  
 ? PURPOSE:                   
 * IT WILL CHANGE OR REVERSE THE NORMAL OUTPUT. IF AN OUTPUT IS TRUE IN REAL, IT WILL CHANGE IT TO FALSE. SAME WAY, IF AN OUTPUT IS FALSE IN REAL, IT WILL CHANGE IT TO TRUE
 
 ? STATEMENT-1  ||  STATEMENT-2       NATURAL OUTPUT        FINAL OUTPUT
 *    TRUE      ||    TRUE               ! TRUE               FALSE
 *    TRUE      ||    FALSE              ! TRUE               FALSE
 *    FALSE     ||    TRUE               ! TRUE               FALSE
 *    FALSE     ||    FALSE              ! FALSE              TRUE



 */
public class cl2_5_LogicalOperators {
  
  public static void main (String arg []){

   // ? Example of LOGICAL &&:
  System.out.println(" Both of the STATEMENTS are TRUE. So, the final OUTPUT will be: "+((3>2) && (5>0)));
  System.out.println(" One of the STATEMENT is FALSE. So, the final OUTPUT will be: "+((3<2) && (5>0)));
  System.out.println(" One of the STATEMENT is FALSE. So, the final OUTPUT will be: "+((3>2) && (5<0)));
  System.out.println(" Both of the STATEMENTS are FALSE. So, the final OUTPUT will be: "+((3<2) && (5<0)));


  System.out.println("\n\n\n");

   // ? Example of LOGICAL ||
  System.out.println(" Both of the STATEMENTS are TRUE. So, the final OUTPUT will be: "+((3>2) || (5>0)));
  System.out.println(" One of the STATEMENT is FALSE. So, the final OUTPUT will be: "+((3<2) || (5>0)));
  System.out.println(" One of the STATEMENT is FALSE. So, the final OUTPUT will be: "+((3>2) || (5<0)));
  System.out.println(" Both of the STATEMENTS are FALSE. So, the final OUTPUT will be: "+((3<2) || (5<0)));


  System.out.println("\n\n\n");
  
   // ? Example of LOGICAL !
  System.out.println(" Both of the STATEMENTS are TRUE. Because of LOGICAL NOT !, the final OUTPUT will be: "+!((3>2) || (5>0)));
  System.out.println(" One of the STATEMENT is FALSE. Because of LOGICAL NOT !, the final OUTPUT will be: "+!((3<2) || (5>0)));
  System.out.println(" One of the STATEMENT is FALSE. Because of LOGICAL NOT !, the final OUTPUT will be: "+!((3>2) || (5<0)));
  System.out.println(" Both of the STATEMENTS are FALSE. Because of LOGICAL NOT !, the final OUTPUT will be: "+!((3<2) || (5<0)));
  }

  
  }

