import java.util.*;
import java.util.Scanner;
public class Allowance {
    public static void main (String []args) {
        int GL, YOS;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your grade level");
        GL = sc.nextInt();

        System.out.println(allowanceCal(GL,YOS)); {
            static int allowanceCal(int G, int Y); {
                int allowance = 2000;
                if(G > 9 || Y > 10) {
                    allowance = allowance * 3;
                    return allowance;
                }
            }
        }
    }
}