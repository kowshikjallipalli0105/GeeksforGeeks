class Solution {
    public static int countBitsFlip(int a, int b) {
        // code here
        int num = a^b;
        int cnt =0;
        while(num!=0){
            cnt++;
            num=num&num-1;
        }
        return cnt;
    }
}
