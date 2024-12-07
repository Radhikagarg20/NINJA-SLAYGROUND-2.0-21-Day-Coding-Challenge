//Switch Case statement

import java.util.Scanner;

public class Solution {
    public static double areaSwitchCase(int ch, double[] a) {
        double area = 0.0;

        switch (ch) {
            case 1:
                area = Math.PI * a[0] * a[0]; 
                break;
            case 2:
                area = a[0] * a[1];  
                break;
            default:
                area = -1; 
        }

        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ch = sc.nextInt();

        if (ch == 1) {
            double r = sc.nextDouble();
            double[] arr = { r };
            double area = areaSwitchCase(ch, arr);
            if (area != -1) {
                System.out.printf("%.5f\n", area);
            } else {
                System.out.println("Invalid choice");
            }
        } else if (ch == 2) {
            double l = sc.nextDouble();
            double b = sc.nextDouble();
            double[] arr = { l, b };
            double area = areaSwitchCase(ch, arr);
            if (area != -1) {
                System.out.printf("%.5f\n", area);
            } else {
                System.out.println("Invalid choice");
            }
        } else {
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}
