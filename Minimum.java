import java.util.Scanner;
import java.util.*;
public class Minimum {
    static void minimum() {
        int a;
        int b;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st value");
        a = sc.nextInt();
        System.out.println("enter the 2nd value");
        b = sc.nextInt();

        if (a < b) {
            System.out.println(a + "is the minimum");
        } else {
            System.out.println(b + "is the minimum");
        }
    }
       public static void main(String []args) {
        minimum();
       }
}