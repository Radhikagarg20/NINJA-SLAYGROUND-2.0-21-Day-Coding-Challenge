//GCD or HCF

public class Solution {
    public static int calcGCD(int n, int m){

    while (m != 0) {
            int remainder = n % m;
            n = m;
            m = remainder;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(calcGCD(6, 4));  
        System.out.println(calcGCD(9, 6));  
        System.out.println(calcGCD(2, 5));  
    }
}