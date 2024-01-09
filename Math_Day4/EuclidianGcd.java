package Math_Day4;

public class EuclidianGcd {
    public static void main (String[] args) {
        int a = 5 ; 
        int b = 10 ; 
        System.out.println(euclidianGcd (a , b ));
      }
      static int euclidianGcd(int a , int b){
        if ( b == 0){
            return a ;
        }
        return  euclidianGcd(b , a % b);
        }
      }

