// Pascal's Triangle

import java.io.*;
import java.util.*;

public class Solution {
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> pascalTriangle = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            ArrayList<Long> row = new ArrayList<>();
            row.add(1L);
            
            for (int j = 1; j < i; j++) {
                long value = pascalTriangle.get(i - 1).get(j - 1) + pascalTriangle.get(i - 1).get(j);
                row.add(value);
            }
            
            if (i > 0) {
                row.add(1L);
            }
            
            pascalTriangle.add(row);
        }
        return pascalTriangle;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayList<ArrayList<Long>> result = printPascal(n);
        
        for (ArrayList<Long> row : result) {
            for (Long val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
