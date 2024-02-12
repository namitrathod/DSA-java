package QuestionThroughMaths;
// we have to find the sum of n row in pascal triangle
public class Question14powerof2 {
    public static void main(String[] args) {
        int n =32; // fix for n =0
        boolean ans =(n&(n-1))==0;
        System.out.println(ans);
    }
    
}