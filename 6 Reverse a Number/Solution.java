public class Solution {
    public static int reverseNumber(int n) {

    int reversedNumber = 0;
        
        while (n > 0) {
            int lastDigit = n % 10; 
            reversedNumber = reversedNumber * 10 + lastDigit;
            n = n / 10; 
        }
        return reversedNumber;  
    }
}
