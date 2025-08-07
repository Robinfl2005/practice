import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1; // Start from the rightmost digit of num

        int carry = 0; // Initialize carry

        while (i >= 0 || k > 0 || carry > 0) { // Continue as long as there are digits in num or k, or there's a carry
            int digitNum = 0;
            if (i >= 0) {
                digitNum = num[i]; // Get the current digit from num
                i--; // Move to the next digit in num
            }

            int digitK = k % 10; // Get the last digit of k
            k /= 10; // Remove the last digit from k

            int sum = digitNum + digitK + carry; // Calculate the sum of current digits and carry

            result.add(sum % 10); // Add the unit digit of the sum to the result
            carry = sum / 10; // Update the carry for the next iteration
        }

        Collections.reverse(result); // Reverse the list to get the correct order
        return result;
    }
}
