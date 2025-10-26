// User function Template for Java

class Solution {
    public int multiply(int[] arr) {
        // code here
        int left=0,right=0;
        int mid = arr.length/2;
        for(int i=0;i<mid;i++){
            left+=arr[i];
        }
        for(int i=mid;i<arr.length;i++){
            right+=arr[i];
        }
        return left*right;
    }
}
