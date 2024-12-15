//{ Driver Code Starts

// } Driver Code Ends
//Back-end complete function Template for Java
import java.util.*;

public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=10*n;
        while(res>=n){
            System.out.print(res+" ");
            res-=n;
        }
    }
}

//{ Driver Code Starts.
// } Driver Code Ends