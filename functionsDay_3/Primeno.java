package functions;
import java.util.*;
public class Primeno {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean ans = isPrime(n);
    System.out.println(ans);
    sc.close();
     
}
static boolean  isPrime (int x) {

if (x==1){
    System.out.println("no");
}
int c = 2;
while(c*c <= x){
    if(x%c==0){
        return false;
    }
  c++;
}  
 return true;
}
}    

