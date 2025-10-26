// User function Template for Java

class Solution {

    public long totalFine(int date, int car[], int fine[]) {
        // code here
        int reso=0;
        int rese=0;
        int n = car.length;
        for(int i=0;i<n;i++){
            if(car[i]%2!=0){
                reso+=fine[i];
            }
            else{
                rese+=fine[i];
            }
        }
        if(date%2==0){
            return reso;
        }
        else{
            return rese;
        }
    }
}