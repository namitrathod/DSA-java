// package datastructure;
import java.util.Scanner;

public class L9_calulator_program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //take the input from user till user does not press X or x

        while(true){
            System.out.println("Enter the operator");
            char op =in.next().trim().charAt(0);
            int ans =0;
            if(op =='+' || op== '-' || op == '*'|| op == '/' || op =='%'){  /// problem with "" and worked with ''
                int num1 =in.nextInt();
                int num2 =in.nextInt();

                if(op=='+'){
                     ans =num1 + num2;
                }
                if(op=='-'){
                     ans =num1 - num2;
                }
                if(op=='*'){
                     ans =num1 * num2;
                }
                if(op=='/'){
                    if(num2 !=0){

                         ans =num1 / num2;
                    }    
                }
                if(op == '%'){
                    ans = num1%num2;
                }
            }
            else if(op == 'x' || op == 'X'){
                    break;
                }
                else{
                    System.out.println("Invalid Operation!!");
                }
            
            System.out.println(ans);
        }
    }
}
