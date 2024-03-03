package Recursion;
// /**
//  * L62_NumberOfStepToReduceTOZero
//  */
// public class L62_NumberOfStepToReduceTOZero {

//      public void main(String[] args) {
//         int n = 14;
//         System.out.println(steps(n));
//      }
//      public int steps(int n){   // makeing it static cause error
//         return helper(n, 0);
//      }
//      private int helper(int n, int steps){
//         if(n==0){
//             return steps;
//         }
//         if(n%2==0){
//             return helper(n/2, steps+1);
//         }
//         else{
//             return helper(n-1, steps+1);
//         }
//      }
// }





/**
 * L62_NumberOfStepToReduceTOZero
 */
public class L62_NumberOfStepToReduceTOZero {

    public static void main(String[] args) {
       int n = 14;
       L62_NumberOfStepToReduceTOZero obj = new L62_NumberOfStepToReduceTOZero();
       System.out.println(obj.steps(n));

       // We create an instance of the class and call the method on that instance because the "steps" method
       // is not declared as static. In Java, non-static methods belong to instances of a class, so we need to 
       //create an instance of the class in order to call the method. If the method were declared as static, we
       // could call it directly without creating an instance of the class.
    }
    public int steps(int n){
       return helper(n, 0);
    }
    private int helper(int n, int steps){
       if(n == 0){
           return steps;
       }
       if(n % 2 == 0){
           return helper(n / 2, steps + 1);
       }
       else{
           return helper(n - 1, steps + 1);
       }
    }
}
