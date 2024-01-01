package functions;
import java.util.*;
public class Amstrong {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int n = sc.nextInt();
    boolean ans = isAmstrong(n);
    System.out.println(ans);
    sc.close();
}
static boolean isAmstrong(int x){
    int orignal = x;
    int sum = 0;
    while(x>0){
        int rem = x%10;
          x = x/10;
        sum += rem*rem*rem;
      
    }
    return sum==orignal;
    
    
}
}
