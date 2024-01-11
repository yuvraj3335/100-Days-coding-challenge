package sorting;
 import java.util.* ;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {5,3,4,1,2};
        insertion(arr);
        System.out.println( Arrays.toString(arr));
       
    }
    static void insertion(int[] arr){
    int n = arr.length ;
    for(int i=0 ; i< n-1 ; i++){
       for (int j = i+1 ; j> 0 ; j--){
         if (arr[j-1] > arr[j] ){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp ; 

         }
           else {
                break;
            }
            
       }
    }
    }
}
