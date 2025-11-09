// User function Template for Java

class Solution {
    String firstAlphabet(String S) {
        // code here
        String[] str = S.split(" ");
        char[] arr = new char[str.length];
        for(int i=0;i<str.length;i++){
            arr[i]=str[i].charAt(0);
        }
        return new String(arr);
    }
};