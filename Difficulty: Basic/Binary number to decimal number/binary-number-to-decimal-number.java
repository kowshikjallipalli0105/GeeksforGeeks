// User function Template for Java

class Solution {
    public int binaryToDecimal(String b) {
        // Code here
        int ans=0;
        for(int i=0;i<b.length();i++){
            char bit = b.charAt(i);
            ans = ans*2+(bit-'0');
        }
        return ans;
    }
}