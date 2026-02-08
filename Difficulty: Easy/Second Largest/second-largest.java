class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int la=-1,sa=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>la){
                sa=la;
                la=arr[i];
            }
            if(arr[i]>sa &&arr[i]<la){
                sa=arr[i];
            }
        }
        return sa;
        
    }
}