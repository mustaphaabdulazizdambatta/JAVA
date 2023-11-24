import java.util.Scanner;
public class TestScanner {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, sum;
        System.out.print("Enter an integer: ");
        a = sc.nextInt();
        System.out.print("Enter another integer: ");

        b = sc.nextInt();
        sum = a + b;
        System.out.print("sum of " + a + " and " + b);
        System.out.println("is a " + sum);
    
    }
}
