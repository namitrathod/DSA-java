// package Recursion;
import java.util.ArrayList;

public class L64_linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,77,6,77,33,56,77};
        int target = 77;
        // System.out.println(linear(arr, target, 0));
        findAllIndex(arr, target, 0);
        System.out.println(list);
        
    }
    static int linear(int[] arr,int target, int index){
        if(index == arr.length-1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return linear(arr, target, index+1);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
            findAllIndex(arr, target, index+1);   // using else in this cause printing only one value in the array.
           //In the provided code, when using the else statement in the findAllIndex method, only one index is printed
           // because the recursive call to findAllIndex is made inside the else block.

           //This means that the recursive call only occurs when the current element is not equal to the target.
            //As a result, the recursive call is skipped for all elements that are equal to the target, leading to
            // only one index being added to the list.
    }
}



