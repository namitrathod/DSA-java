import java.util.Scanner;

public class L12_Function {

    //  DRY don't repeat Yourself
    public static void main(String[] args){
        sum(); // This is calling of function
        int ans = sum2();
        System.out.println(ans);
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = in.nextInt();
        System.out.println("Enter number 2");
        int num2 = in.nextInt();
        int sum =num1 +num2;
        System.out.println("the sum is "+ sum);
    }
    // return the value 
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = in.nextInt();
        System.out.println("Enter number 2");
        int num2 = in.nextInt();
        int sum =num1 +num2;
        return sum;
    }
}
