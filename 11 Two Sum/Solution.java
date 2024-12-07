//Two Sum

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static String read(int n, int []book, int target){

    Set<Integer> seen = new HashSet<>();
        
        for (int pages : book) {
            if (seen.contains(target - pages)) {
                return "YES";
            }
            seen.add(pages);
        }
        return "NO";
    }
    
    public static void main(String[] args) {
        int[] book1 = {4, 1, 2, 3, 1};
        int target1 = 5;
        System.out.println(read(book1.length, book1, target1));
        
        int[] book2 = {1, 2};
        int target2 = 1;
        System.out.println(read(book2.length, book2, target2));  
        
        int[] book3 = {4, 1, 2, 3, 1};
        int target3 = 5;
        System.out.println(read(book3.length, book3, target3));  
    }
}