package Math_Day4;

public class GcdForLoop {
  public static void main (String[] args) {
    int a = 36 ; 
    int b = 84 ; 
    System.out.println(gcd (a , b ));
  }
  static int gcd(int a , int b){
    int ans = 0 ;
    for (int i = 1 ; i <= a || i <= b ; i ++){
        if (a % i == 0 && b % i == 0 ){
        ans = i;
        }

    }
    return ans ;
  }
}
