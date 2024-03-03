package Search;
public class L38_orderAgnosticBinarySearch {
    public static void main(String[] args) {
        int [] arr = new int[] {89,45,12,10,9,7,5,2,0,-1,-25};
        int target = 10;
        System.out.println("Index of element is "+ orderAgnosticbs(arr, target));
    }
    static int orderAgnosticbs(int [] arr, int target){
        int start = 0;
        int end =arr.length-1;

        // find weather array is sorted in ascending or descending order
        boolean isAsc = arr[start]<arr[end];
        // boolean isAsc;
        // if(arr[start]< arr[end]){
        //     isAsc = true;
        // } else{
        //     isAsc =false;
        // }



        while (start<=end) {
            // find middle value
            // int middle = (start + end)/2;   // if this is used then there is chances that value get out of the range of integers.
            // therefore this is better
            int mid = start + (end-start)/2;

            if(target == arr[mid]){
                return mid  ;
            }

            if(isAsc){
                if(target<arr[mid]){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            } 
            else{
                if(target>arr[mid]){                  // change is here only
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }   

        }
        return -1;
    }
}
