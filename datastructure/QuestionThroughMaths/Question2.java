package QuestionThroughMaths;
// you have been given an array which has every no. take comes twice except one. find that no.
public class Question2 {
    public static void main(String[] args) {
        int [] arr ={2,1,3,2,5,3,5,4,1};
        System.out.println(ans(arr));
    }
    static int ans(int [] arr){
        int unique = 0;
        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }
}
