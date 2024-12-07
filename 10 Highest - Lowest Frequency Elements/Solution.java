//Highest / Lowest Frequency Elements

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] getFrequencies(int[] v) {
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : v) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int highestFreq = Integer.MIN_VALUE;
        int lowestFreq = Integer.MAX_VALUE;
        int highest = Integer.MAX_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (freq > highestFreq) {
                highestFreq = freq;
                highest = num;
            } else if (freq == highestFreq && num < highest) {
                highest = num;
            }

            if (freq < lowestFreq) {
                lowestFreq = freq;
                lowest = num;
            } else if (freq == lowestFreq && num < lowest) {
                lowest = num;
            }
        }
        
        return new int[] {highest, lowest};
    }

    public static void main(String[] args) {
        int[] v = {1, 2, 3, 1, 1, 4};
        int[] result = getFrequencies(v);
        System.out.println(result[0] + " " + result[1]);
    }
}
