package sorting;
import java.util.* ;
public class BubbleSort {
   public static void main(String[] args){
    int [] arr = {1,3,5,4,2};
    bubbleSort(arr); 
    System.out.println(Arrays.toString(arr));
   } 
   static void bubbleSort(int [] arr){
    int n = arr.length ;
   
      for ( int i = 0 ; i< n - 1 ; i++){
         boolean swapped = false ;
         for (int j = 1 ; j < n - i ; j++){
           if (arr [j] < arr[j-1]){
            int temp = arr[j];
             arr[j] = arr[j-1 ]; 
             arr[j-1] = temp ;
             swapped = true ;
           }
         }
        if (swapped != true){
            break ;
        } 
      }
   }
}
