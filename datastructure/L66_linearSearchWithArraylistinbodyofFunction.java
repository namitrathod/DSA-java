import java.util.ArrayList;

public class L66_linearSearchWithArraylistinbodyofFunction {
    public static void main(String[] args) {
        int[] arr = {1,45,64,44,33,45,66,45};
        System.out.println(linear(arr, 45, 0));
    }
    static ArrayList<Integer> linear(int[]arr, int target, int index){
        ArrayList<Integer> ans = new ArrayList<>();
        if(index == arr.length){
            return ans;
        }
        if(arr[index] == target){
            ans.add(index);
        }
        ArrayList<Integer> ansfrombelowcalls = linear(arr, target, index+1);
        ans.addAll(ansfrombelowcalls);                                     // we have to use add ALL here
        return ans;
    }
}
