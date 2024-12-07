//Number of digits

public class Solution {
    public static int countDigits(int n) {
        int count = 0;
        
        if (n == 0) return 1;
        
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 123; 
        System.out.println(countDigits(n));
    }
}
