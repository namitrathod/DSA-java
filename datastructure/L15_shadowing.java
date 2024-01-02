public class L15_shadowing {
    static int a =20;        
    public static void main(String[] args){
        System.out.println(a); // 20
        fun(); // 20
        int a = 50;                //////       'a' defined earlier has been overridden by this line
        System.out.println(a);    // 50
        fun(); // 20
    }
    static void fun(){
        System.out.println(a);
    } 

}
