def pos(n):
    if n == 0:
        print("already Zero")
    else:
        for i in range(n-1, -1, -1 ):
            print(i, end=" ")
    ## Write the code
        
    
def neg(n):
    if n==0:
        print("already zero")
    for i in range(n,1):
        print(i, end=" ")