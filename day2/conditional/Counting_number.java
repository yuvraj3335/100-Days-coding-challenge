import java.util.*;
public class Counting_number {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    while (n>0){
        int rem = n%10;
        if (rem==3){
            count ++;
        }
        n = n/10 ; 
    
    } 
    sc.close();
    System.out.println(count);
    }
}

