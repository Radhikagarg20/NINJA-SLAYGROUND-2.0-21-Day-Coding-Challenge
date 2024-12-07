//Reverse an Array

public class Solution {
    public static int[] reverseArray(int n, int []nums) {

        int left = 0, right = n - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] result = reverseArray(6, new int[]{5, 7, 8, 1, 6, 3});
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
