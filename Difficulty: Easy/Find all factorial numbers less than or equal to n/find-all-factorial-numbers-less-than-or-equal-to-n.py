#User function Template for python3

class Solution:
    def factorialNumbers(self, n):
    	#code here 
    	i=2
    	fact=1
    	lis=[]
    	while fact<=n:
    	    lis.append(fact)
    	    fact*=i
    	    i+=1
    	return lis
    	    
    	    
    	


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        N = int(input())
        ob = Solution()
        ans = ob.factorialNumbers(N)
        for i in ans:
            print(i, end=" ")
        print()

# } Driver Code Ends