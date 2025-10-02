// User function Template for Java
class Solution {
    public int search(int k, ArrayList<Integer> arr) {
        // code here
        int len = arr.size();
        for(int i=0;i<len;i++){
            if(arr.get(i)==k){
                return i+1;
            }
        }
        return -1;
    }
}