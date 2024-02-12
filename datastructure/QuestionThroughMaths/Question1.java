package QuestionThroughMaths;

public class Question1 {
    public static void main(String[] args) {
        int n = 63;
        System.out.println(isodd(n));
    }
    private static boolean isodd(int n){
        return (n&1)==1;
    }
}
