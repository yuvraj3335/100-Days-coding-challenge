
package day2.First;
import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
          String x = "";
        for (int i=n-1; i>=0;--i){
         
           x = x + str.charAt(i);

        }
        if (str.equals(x)){
            System.out.println("yes palindrome");
        }
        else{
            System.out.println("no");
        }
        sc.close();
    }
}
