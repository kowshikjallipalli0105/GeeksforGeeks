class Solution {
    public double findMedian(int[] arr) {
        // Code here.
        Arrays.sort(arr);
        int n = arr.length;
        if(n%2==1){
            return  arr[n/2];
        }
        return (double)(arr[n/2]+arr[n/2-1])/2;
        
    }
}
