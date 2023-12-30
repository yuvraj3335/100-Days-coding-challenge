import java.util.*;
public class Switchcase {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
   int empId = sc.nextInt();
   String industry = sc.next();
   sc.close();
   switch(empId){
    case 1:
    System.out.println("hhj");
    break;
    case 2:
    System.out.println("tuuj");
    break;
    case 3:
    System.out.println("yuj");
    switch(industry){
    case "ECE":
    System.out.println("ECE");
    break;
     case "IT":
    System.out.println("IT");
    break;
     }
    break;
    default:
    System.out.println("hfgh");

   }
    }
}
