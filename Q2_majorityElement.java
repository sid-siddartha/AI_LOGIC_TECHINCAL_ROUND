import java.util.Arrays;

public class Q2_majorityElement {
    public static int getMajorityElement(int[] nums) {
        int count = 0;
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                res = nums[i];
            }

            if (nums[i] == res) {
                count++;
            } else {
                count--;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println("Input: " + Arrays.toString(nums));

        int result = getMajorityElement(nums);
        System.out.println("Majority Element : " + result);
    }
}
