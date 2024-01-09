package Math_Day4;

public class Factors {
public static void main (String [] args){
    int n = 36 ; 
    factors (n);
}
static void factors (int n ){
   for (int i = 1 ; i*i <= n ; i++){
    if (n%i == 0){
        if (i == n/i){
       System.out.println( i ); 
        }
        else{
        System.out.println( i + ","  + n/i);
    }
    }
   } 
}
}
