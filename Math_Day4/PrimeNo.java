package Math_Day4;

public class PrimeNo {
    public static void main(String[] args) {
       int n = 2;
       System.out.println(prime(n)); 
    }
    static boolean prime(int n){
    if (n<=1){
       return false; 
    }
    for (int i = 2; i*i<=n ;i++ ){
    if (n%i == 0){
      return false;  
    }
    }
    return true;
    }
}
