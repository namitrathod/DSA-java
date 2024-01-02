package Assignments;

import java.util.Scanner;

public class A1_1_factorsofnumber {
        public static void main(String[] args) {
  
        int num = 7;
  
       System.out.println( "Factors of " + num + " are " );
  
       // finding and printing factors b/w 1 to num
       for(int i = 1; i <= num; i++)
       {
           if(num % i == 0)
               System.out.println(i + " "); 
       }
  
        }
   }
  // Time Complexity : O(n) 
  // Auxiliary Space : O(1)