package Math_Day4;

public class SimpleSieve {
   public static void main (String[] args) {
      int n = 40 ; 
      sieve(n);
   }
   static void sieve(int n){
    boolean [] prime = new boolean[n+1];
    for (int i = 0 ; i<= n ; i++ ){
        prime[i] = true;
    }   
    for (int i = 0 ; i*i <= n ;i++){
        if (prime[i] == true){
       for(int j = i*2 ;j <=n ; j = j+i){
         prime[j] = false;
       }

        }
    }
    for (int i = 0 ; i<=n ; i++) {
      if (prime[i] == true ){
         System.out.println(i);
      }
  

    }
   }
}
