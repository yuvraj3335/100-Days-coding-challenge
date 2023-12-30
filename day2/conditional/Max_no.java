import java.util.*;
public class Max_no {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        while (true) {
            System.out.println(" Enter number ");
             int num = sc.nextInt();
             if(num==0){
                break;
             }
             if(num>max){
                max = num;
             }
        }
        System.out.println(max);
        sc.close();
    }
}
