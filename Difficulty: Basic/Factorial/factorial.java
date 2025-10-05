class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        // code here
        return (n<=1)? 1: n*factorial(n-1);
    }
}
