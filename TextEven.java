// import java.util.Scanner;
// import java.util.*;
// public class TextEven {
//     public static void main(String []args){
    
//         int number;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any number");
//         number = sc.nextInt();
//         if(number % 2 == 0) {
//             System.out.println(number + " is even");
//         }
//             else {
//                 System.out.println(number + " is odd");
//             }
//         }
//     }

import java.util.Scanner;
import java.util.*;
public class TextEven {
   static void isEven() {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        a = sc.nextInt();
        if(a % 2 == 0) {
            System.out.println(a + " is even");
        }
            else {
                System.out.println(a + " is odd");
             } 
   }
   public static void main(String [] args) {
    isEven();
   }
}
