import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // Problem: Find indices of the two numbers such that they add up to a specific target.
    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(nums[i], i);
        }
        return new int[] {}; // No solution found
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = findTwoSum(numbers, target);
        
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        System.out.println("Because " + numbers[result[0]] + " + " + numbers[result[1]] + " == " + target);
    }
}
