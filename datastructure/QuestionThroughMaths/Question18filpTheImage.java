package QuestionThroughMaths;

import java.util.Arrays;

public class Question18filpTheImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};

        for(int[] a:image){
            System.out.println(Arrays.toString(a));
        }

    }
    static int[][] flipImage(int [][] image){
        for(int [] row : image){
            // reverse the array 
            for(int i =0; i< (image[0].length+1)/2;i++){
                //swap 
                int temp = row [i]^1;
                row[i] = row[image[0].length-i-1];
                row[image[0].length-i-1] = temp;

            }
        }
        return image;
    }
    
}


// public class Question18filpTheImage {
//     public static void main(String[] args) {
//         int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        
//         int[][] flippedImage = flipImage(image);

//         for(int[] row : flippedImage){
//             System.out.println(Arrays.toString(row));
//         }
//     }
    
//     static int[][] flipImage(int[][] image){
//         for(int[] row : image){
//             // Reverse the array
//             for(int i = 0; i < (image[0].length + 1) / 2; i++){
//                 // Swap
//                 int temp = row[i] ^ 1;
//                 row[i] = row[image[0].length - i - 1] ^ 1;
//                 row[image[0].length - i - 1] = temp;
//             }
//         }
//         return image;
//     }
// }
