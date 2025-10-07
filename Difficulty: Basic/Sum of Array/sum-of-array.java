// User function Template for Java

class Solution {
    int arraySum(int arr[]) {
        // code here
        int n = arr.length;
        int total = 0;
        for(int i=0;i<n;i++){
            total+=arr[i];
        }
        return total;
    }
}
