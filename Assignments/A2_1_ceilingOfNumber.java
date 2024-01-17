package Assignments;

public class A2_1_ceilingOfNumber {
    public static void main(String[] args) {
        char [] arr ={'c', 'f','j'};
        char target = 'k';
        System.out.println(binarySearch(arr, target));
        
    }
    static char binarySearch(char [] arr, char target){
        int start =0;
        int end = arr.length-1;    // because last element has index "length -1"
        while (start<=end) {
            // find middle value
            // int middle = (start + end)/2;   // if this is used then there is chances that value get out of the range of integers.
            // therefore this is better
            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end = mid -1;
            }else {
                start = mid +1 ;
            }

        }
        return arr[start%arr.length];
    }
    
}
