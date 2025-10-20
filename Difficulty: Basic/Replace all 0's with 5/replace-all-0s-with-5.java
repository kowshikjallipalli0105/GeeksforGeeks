class Solution {
    int convertfive(int num) {
        // Your code here
        String str = String.valueOf(num);
        str = str.replace('0','5');
        return Integer.parseInt(str);
    }
}