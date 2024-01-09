package Math_Day4;

public class LCM {
    public static void main (String[] args) {
        int a = 5 ; 
        int b = 10 ; 
        System.out.println(lcm(euclidianGcd (a , b ) , a , b ));
      }
      static int lcm (int gcd , int a , int b){
        return a * b / gcd ;
      }
      static int euclidianGcd(int a , int b){
        if ( b == 0){
            return a ;
        }
        return  euclidianGcd(b , a % b);
        }
}
