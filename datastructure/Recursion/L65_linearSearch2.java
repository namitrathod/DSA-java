package Recursion;
import java.util.ArrayList;

public class L65_linearSearch2 {
    public static void main(String[] args) {
        int[] arr = {1,45,64,44,33,45,66,45};
        ArrayList<Integer> ans = new ArrayList<>();
        System.out.println(linear(arr, 45, 0, new ArrayList<>()));   // Pay attention
        linear(arr, 45, 0, ans);                                     // Pay attention
        System.out.println(ans);

    }
    static ArrayList<Integer> linear(int[]arr, int target, int index, ArrayList<Integer> ans){
        if(index == arr.length){
            return ans;
        }
        if(arr[index] == target){
            ans.add(index);
        }
        return linear(arr, target, index+1, ans);
    }

}
