class Solution {
    public static int sumOfDigits(int n) {
        // Code here
        String str = n+"";
        int sum =0;
        for(int i=0;i<str.length();i++){
            sum+=str.charAt(i)-'0';
        }
        return sum;
    }
}
