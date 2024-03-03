package Function;
import java.util.Scanner;

public class L13_Function2 {

    /////////////////////////////////////////// In java there is only pass by value   No pass by refference.

    ////// In primitive data type int, short, char, byte,...   -----------Just value is passed.
    ////// In Object and stuffs                                -------------Pass by value of variable.
    public static void main(String[] args){
        String message = greet();
        System.out.println(message);

        int ans = sum(20, 30);
        System.out.println(ans);


        Scanner input = new Scanner(System.in);
        String name = input.next();
        String personalised = myGeet(name);
        System.out.println(personalised);
        

    }
    private static String myGeet(String name) {
        String message ="Hello "+ name;
        return message;
    }
    static String greet(){
        String greeting = "Hello, How are you";
        return greeting;
    }
    // Pass the value of the number when you are calling the method in main().
    // argument
    static int sum(int a,int b){
        int sum = a+b;
        return sum;
    }
}
