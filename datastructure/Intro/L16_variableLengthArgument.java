package Intro;
import java.util.Arrays;

public class L16_variableLengthArgument {
    public static void main(String[] args) {
        fun(2,3,4,5,67,8);
        fun(); // no argument is also fine    
        multiple(2, 5, "namit", "Manish", "navin", "Aman");
    }
    static void fun(int ...v){     // it is taking as array of integer. Similarliy, array of String.
    System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, String ...v) // variable length argument always comes at last.
    {

    }
}
