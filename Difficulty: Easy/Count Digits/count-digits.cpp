class Solution {
  public:
    // Function to count the number of digits in n that evenly divide n
    int evenlyDivides(int n) {
        // code here
        int count=0;
        int temp=n;
        while(n>0){
            int d=n%10;
            if(d!=0 && temp%d==0) count++;
            n/=10;
        }
        return count;
    }
};