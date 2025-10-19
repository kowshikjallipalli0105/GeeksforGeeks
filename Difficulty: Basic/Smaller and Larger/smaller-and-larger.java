// User function Template for Java

class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        // code here
        int small=0;
        int large =0, n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<=target){
                small++;
            }
            if(arr[i]>=target){
                large++;
            }
        }
        return new int[]{small,large};
    }
}