// package Recursion;
public class L52_bsRecursion {

    // For Binary Search array should be sorted.
    public static void main(String[] args) {
        int[] arr ={1,3,5,22,25,31};
        int target = 31;
        System.out.println(search(arr, target, 0, arr.length-1));
        
    }
    static int search(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }

        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            return search(arr,target,s,m-1);
        }
            return search(arr, target, m+1, e);
    }
}
