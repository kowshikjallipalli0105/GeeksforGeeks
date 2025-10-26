class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i:arr){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int i:mp.keySet()){
            if(mp.get(i)%2!=0){
                return i;
            }
        }
        return 0;
    }
}