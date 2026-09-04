public class Q3_swap {

    /**
     * Simple & Optimal One-Pass (Right-to-Left) Approach
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static int getMaximumSwap(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        int n = digits.length;

        int maxIdx = n - 1;
        int leftIdx = -1, rightIdx = -1;

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] > digits[maxIdx]) {
                maxIdx = i; // Found a larger digit on the right
            } else if (digits[i] < digits[maxIdx]) {
                leftIdx = i;      // Smaller digit on the left to swap
                rightIdx = maxIdx; // Larger digit on the right to swap with
            }
        }

        // If a swap is needed, perform it
        if (leftIdx != -1) {
            char temp = digits[leftIdx];
            digits[leftIdx] = digits[rightIdx];
            digits[rightIdx] = temp;
            return Integer.parseInt(new String(digits));
        }

        return num;
    }

    public static void main(String[] args) {
        int num = 2736;
        int result = getMaximumSwap(num);
        System.out.println("Original: " + num);
        System.out.println("Max Swap: " + result); // Output: 7236
    }
}
