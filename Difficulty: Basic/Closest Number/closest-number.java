class Solution {
    static int closestNumber(int n, int m) {
        // code here
        double x =(double) n/m;
        double y;
        if(x>0){
            y= x+0.5;
        }else{
            y = x-0.5;
        }
        
        int result = m*(int)y;
        return result;
    }
}