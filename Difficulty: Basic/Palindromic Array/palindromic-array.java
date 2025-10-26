/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        int n = arr.length;
        for(int i=0;i<n;i++){
            String s = String.valueOf(arr[i]); 
            int l=0,r=s.length()-1;
            boolean ispalin = true;
            while(l<r){
                if(s.charAt(l)!=s.charAt(r)){
                    ispalin = false;
                    break;
                }
                l++;r--;
            }
            if(!ispalin) return false;
        }
        return true;
    }
    
}