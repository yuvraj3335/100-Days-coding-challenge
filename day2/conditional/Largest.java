
import java.util.*; 

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers to check the max: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maxVal = a;
        
        if (b > maxVal) {
            maxVal = b;
        } 
        if (c > maxVal) {
            maxVal = c;
        }
       sc.close();
        
        System.out.println("The largest number is " + maxVal);
    }
}