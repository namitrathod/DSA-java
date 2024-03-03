package Search;
public class L33_findMin {
    public static void main(String[] args) {
        int [] arr = {42,45,1,2,3,-4,4,111};
        System.out.println("Index of min no is "+ findMinI(arr));
        System.out.println("Min no is "+ findMin(arr));
    }
    static int findMinI(int [] arr){
        if(arr.length==0){
            return -1;
        }

        int min = arr[0];
        int minIndex = 0;
        for(int i= 0; i <arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;

    }
    static int findMin(int [] arr){
        if(arr.length==0){
            return -1;
        }

        int min = arr[0];
        int minIndex = 0;
        for(int i= 0; i <arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }
        return min;

    }
}
