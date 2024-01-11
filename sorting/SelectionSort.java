package sorting;
import java.util.*;
public class SelectionSort {
    public static void main (String [] args){
    int [] arr = {2,4,3,5,1};
    for (int i = 0 ; i< (arr.length) -1 ; i++){
    // very important on how how allocate ending element 
    int end = (arr.length - 1) - i ;
    int maxIndex = max(arr , 0 , end );
    swap(arr , maxIndex , end);
    }
    System.out.println(Arrays.toString(arr));

    }
    static int max(int [] arr , int start , int end){
     int maximum = start ;
     for(int j = start ; j<=end; j++){
        if (arr[maximum] < arr[j]){
           maximum = j ;
        }
     }
     return maximum ;
    }
    static void swap(int [] arr , int maxIndex , int end){
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[end];
        arr[end] = temp ;
    }
    
}