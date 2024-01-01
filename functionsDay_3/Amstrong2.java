package functions;

import java.util.Scanner;

public class Amstrong2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   // System.out.println("enter number");
   // int n = sc.nextInt();
    isAmstrong();
   // System.out.println(ans);
    sc.close();
}
static void isAmstrong(){
    for(int i=100;i<=999;i++){
    int x = i;
    int orignal = x;
    int sum = 0;
    while(x>0){
        int rem = x%10;
          x = x/10;
        sum += rem*rem*rem;
    }
    if(orignal == sum) {
        System.out.println(orignal);
    }  
    
}   
}
}