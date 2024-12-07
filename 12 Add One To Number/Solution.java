//Add One To Number 

import java.util.*;

public class Solution {
    public static ArrayList<Integer> addOneToNumber(ArrayList<Integer> arr) {
        int n = arr.size();

        for (int i = n - 1; i >= 0; i--) {
            if (arr.get(i) < 9) {
                arr.set(i, arr.get(i) + 1);
                return removeLeadingZeros(arr);
            } else {
                arr.set(i, 0);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);
        result.addAll(arr);
        return result;
    }

    public static ArrayList<Integer> removeLeadingZeros(ArrayList<Integer> arr) {
        while (arr.size() > 1 && arr.get(0) == 0) {
            arr.remove(0);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> digits = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                digits.add(sc.nextInt());
            }
            ArrayList<Integer> result = addOneToNumber(digits);
            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
