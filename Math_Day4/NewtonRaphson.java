package Math_Day4;
public class NewtonRaphson {
    public static void main(String[] args){
   int n = 36 ; 
   System.out.println( raphson (n));
 
    }
static double raphson(int n ){
  double x = n; 
  double root = 0.0;
  while (true){
   root = (x + (n/x)) * 0.5 ;  
   if (Math.abs(root-x) < 1 ){
    break ;
   }
   x = root ; 
  }
  return root ;
}
}
