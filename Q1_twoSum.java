import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q1_twoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int ele = target - nums[i];

            if (map.containsKey(ele)) {
                return new int[] { map.get(ele), i };
            }

            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Output: " + Arrays.toString(result));
    }
}
