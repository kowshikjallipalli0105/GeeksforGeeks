// User function Template for Java

class Solution {
    // Function to find the minimum value required to balance the array.
    public int minValueToBalance(List<Integer> arr) {
        // code here
          if (arr == null || arr.size() <= 1) return 0;

        int n = arr.size();
        int mid = n / 2;
        int left = 0, right = 0;
        for (int i = 0; i < mid; i++) {
            left += arr.get(i);
        }
         int rightStart = (n % 2 == 0) ? mid : (mid + 1);
        for (int i = rightStart; i < n; i++) {
            right += arr.get(i);
        }
        return Math.abs(left-right);
    }
}