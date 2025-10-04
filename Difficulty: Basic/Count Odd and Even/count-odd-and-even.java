class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
         int[] result = {0, 0};
        
        for(int i = 0; i < arr.length; i++) {
            result[arr[i] % 2 != 0 ? 0 : 1]++;
        }
        return result;
    }
}