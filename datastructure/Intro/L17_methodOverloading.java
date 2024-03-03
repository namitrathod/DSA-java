package Intro;
public class L17_methodOverloading {
    public static void main(String[] args) {
        fun(1);
        fun("namit");
        
    }
    static void fun (int a){
        System.out.println(a+"this is integer");
    }
    static void fun (String a){
        System.out.println(a+"this is String");
    }
}
