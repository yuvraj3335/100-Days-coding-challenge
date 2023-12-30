package day2.First;
import java.util.*;
public class Until0 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int sum = 0;
    while(true){
        System.out.println("Enter numbers");
        int n = sc.nextInt();
        if(n==0) {break;}
      
        sum = sum + n ;
       
    }
     System.out.println(sum);
    sc.close();
 }   
}
