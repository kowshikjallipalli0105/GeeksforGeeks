
class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        // Code here
        int cnt =0;
        for(int i:arr){
            cnt = i<=x?cnt+1:cnt;
        }
        return cnt;
    }
}